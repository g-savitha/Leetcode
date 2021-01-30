class Solution {
    public void moveZeroes(int[] nums) {
        int temp;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }
}
//TC: O(n), SC: O(1)