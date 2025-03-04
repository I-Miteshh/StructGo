/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1] */

//Output can be given using Hashmap - This is done in O(n2) complexity for simplicity purpose

class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,9,10,11,24,9};
        int target = 18 ;
        int[] result = twoSum(arr,target);
        System.out.println("Indices which adds upto "+ target + " are ");
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        int desired_value = 0;
        for(int i=0; i<nums.length; i++){
            desired_value = target - nums[i];
            for(int j=0; j<nums.length; j++){
                if(i!=j && nums[j] == desired_value){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}

