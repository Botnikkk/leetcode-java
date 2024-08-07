import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {9};
        Solution SolutionObject = new Solution();
        int[] plusOne = SolutionObject.plusOne(array);
        for(int x : plusOne){System.out.print(x + ",");}
    }


}

class Solution{

    /*Q5 - https://leetcode.com/problems/plus-one/description/ */

    public int[] plusOne(int[] digits) {
        for(int x = digits.length - 1; x >=0 ; x-- ){
            if(digits[x] == 9){
                digits[x] = 0;
            }else{
                digits[x] = digits[x] + 1;
                return digits;
            }
        }
        int[] output = new int[digits.length + 1];
        Arrays.fill(output, 0);
        output[0] = 1;
        return output;
    }

    /*Q4 - https://leetcode.com/problems/search-insert-position/ */

    public int searchInsert(int[] nums, int target) {
        for(int x = 0; x < nums.length; x++){
            if(nums[x] == target || nums[x] > target){
                return x;
            }
        }
        return nums.length;
    }

    /*Q3 - https://leetcode.com/problems/remove-element/*/

    public int removeElement(int[] nums, int val) {     
        ArrayList<Integer> ArrayList = new ArrayList<Integer>();
        
        for(int x : nums){
            if(x == val){
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
    
    /*Q2 - https://leetcode.com/problems/remove-duplicates-from-sorted-array/ */

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

    /*Q1 - https://leetcode.com/problems/two-sum/ */

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