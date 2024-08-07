import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,1,2};
        Solution SolutionObject = new Solution();
        SolutionObject.removeDuplicates(array);
        System.out.println();
        for(int x : array){System.out.print(x+",");}
    }


}

class Solution{

    

    /*https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */

    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        
        for(int x : nums){
            if(ArrayList.contains(x)){
                continue;
            }else{

                ArrayList.add(x);
            }
        }
        for(int x = 0; x < nums.length; x++ ){
            if(x < ArrayList.size()){
                nums[x] = ArrayList.get(x); 
            }else{
                nums[x] = 0;
            }
        }
        return ArrayList.size();
    }

    /*https://leetcode.com/problems/two-sum/ */

    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        int length = nums.length;
        for(int x = 0; x < length; x++ ){
            for(int y = x+1; y < length; y++){
                if(nums[x] + nums[y] == target){
                    output[0] = x; output[1] = y;
                    break;
                }
            }
        }
        return output;
    }

}