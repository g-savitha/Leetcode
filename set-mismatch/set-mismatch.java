class Solution {
    public int[] findErrorNums(int[] nums) {
        int xor = 0;

        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i] ^(i+1);
        }
        int setBit = xor & ~(xor-1);
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            if((setBit & nums[i])!=0){
                res ^= nums[i];
            }
            if((setBit & (i+1))!=0){
                res ^= (i+1);
            }
        }
        for(int i : nums){
            if(i==res){
                return new int[] {res,xor^res};
            }
        }
        return new int[] {xor ^ res, res};
        
    }
}