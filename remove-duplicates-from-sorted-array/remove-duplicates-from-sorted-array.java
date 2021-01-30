class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int res = 1;
        for(int i = 1; i < length; i++){
            if(nums[res-1] != nums[i]){
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
        
    }
} //TC : O(n), SC: O(1)