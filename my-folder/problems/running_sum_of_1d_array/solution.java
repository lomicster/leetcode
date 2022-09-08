class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        
        return nums;
        
    }
    
    //time complexity = O(n)
    //space complexity = O(1)
}