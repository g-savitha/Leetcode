class Solution {
    public int trap(int[] height) {
        int water = 0;
        int n = height.length;
        
        if(n==0){
            return 0;
        }
        
        //2 pointer approach
        
        int lB = height[0];
        int rB = height[n-1];
        
        int res = 0;
        
        int left = 0, right = n-1;
        
        while(left < right){
            if(height[left]< height[right]){
                
                if(height[left]>=lB){
                    lB = height[left];
                }
                else{
                 res += lB - height[left];
                }
                left++;
            }
            else{
                if(height[right]>=rB){
                    rB = height[right];
                }
                else{
                    res += rB - height[right];
                }
                right--;
            }
        }
        return res;
        
        //TC : O(n), SC: O(1)
        
        
//         int[] lmax = new int[n];
//         int[] rmax = new int[n];
        
//         lmax[0] = height[0];
//         rmax[n-1] = height[n-1];
//         //calculate max height of building from left and store
//         for(int i = 1; i < n; i++){
//             lmax[i] = Math.max(height[i],lmax[i-1]);
//         }
//         //calculate the max height of building from right and store
//         for(int i = n-2; i>=0; i--){
//             rmax[i] = Math.max(height[i],rmax[i+1]);
//         }
//         //calculate collected water
//         for(int i =1; i < n; i++){
//             water += (Math.min(lmax[i],rmax[i]) - height[i]);
//         }
//         return water;
    }
} //TC: O(n) , SC : O(n)