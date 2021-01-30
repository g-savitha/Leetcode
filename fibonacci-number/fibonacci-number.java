class Solution {
    public int fib(int n) {
        //iterative top-down approach
        if(n<=1) return n;
        
        if(n==2) return 1;
        
        int curr = 0; int pre1 = 1; int pre2 = 1;
        for(int i = 3; i <= n; i++){
            curr = pre1 + pre2;
            pre2 = pre1;
            pre1 = curr;
        }
        return curr;
    }
}

//TC : O(n), SC: O(1)