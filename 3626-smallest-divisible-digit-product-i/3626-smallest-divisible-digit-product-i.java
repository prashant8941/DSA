class Solution {
    public static int product(int n ){
        int prd = 1 ; 
        while( n != 0 ){
            int last = n%10 ; 
            prd*= last ; 
            n/= 10 ; 
        }
        return prd ; 
    }
    public int smallestNumber(int n, int t) {
      
         while(product(n)% t !=  0 ){
            n++ ; 
         }
         return n ; 
        
        
    }
}