class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0) return 0;
        //kadane's algorithm
        int maxSoFar = nums[0];
        int maxEnding = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            maxEnding = Math.max(maxEnding + nums[i] , nums[i]);
            maxSoFar = Math.max(maxEnding,maxSoFar);
        }
        return maxSoFar;
    }
}