class Solution {
    public int majorityElement(int[] nums) {
        
        //Moore's Voting algorithm - TC : O(n), sc: O(1)
        int res = 0; int count  = 1; int n = nums.length;
        
        // find a majority candidate
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[res]) count++;
            else count--;
            
            if(count == 0) {res = i; count = 1;}
        }
        return nums[res];
    }
}