class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        int res = 0;
        for(int i = 1; i <=n; i++){
            xor ^= i;
        }
        for(int i = 0; i < nums.length; i++){
            res ^= nums[i];
        }
        
        return xor ^ res;
        
        
    }
}