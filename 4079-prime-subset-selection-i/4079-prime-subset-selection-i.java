class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        boolean[]prime = new boolean[n+1]; 
           List<Integer>ans = new ArrayList<>(); 
           if( n <2){
            return ans ; 
           }else if( n == 2 ){
            if(n <= s ){
            ans .add(2); 
                return ans ; 
            }
           }
         Arrays.fill(prime , true ); 
         prime[0] = false ; 
         prime[1] = false ; 
         prime[2] = true ;

         for( int i = 2 ;i*i <= n ;i++){
            for( int j = i*i ;j <= n ;j+=i ){
                prime[j] = false ; 
            }
         }  
      
         int sum = 0 ; 
         for( int i = 0 ;i <= n ;i++){
            if( prime[i] && sum+i <= s ){
               ans.add(i); 
                sum+=i ; 
            }
         }
         return ans ; 

    }
}