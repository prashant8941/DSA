class Solution {
     long mod = 1000000007L;

    public int minimumCost(int[] nums, int k) {
        int refil = k ; 
        int n = nums.length ; 
        Arrays.sort(nums); 
        long  ans = 0 ; 
        for( int i = 0 ;i < n ;i++){
            if( nums[i] <= refil){
                refil-=nums[i]; 
            }else{
                int rem = nums[i]- refil ; 
                int need =(int) Math.ceil((double)rem/k) ; 

                ans+=need ; 
                refil = (need*k) - rem ; 
            }
        }
        long a = ans;
        long b = ans + 1;

        if (a % 2 == 0) {
            a /= 2;
        } else {
            b /= 2;
        }

        long sum = ((a % mod) * (b % mod)) % mod;

        return (int) sum;
        
    }
}