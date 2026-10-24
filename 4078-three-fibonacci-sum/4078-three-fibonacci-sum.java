class Solution {
    public boolean threeFibonacciSum(int n) {
        if( n % 2 != 0 )return false ; 
        int target = n/2 ; 
        int a = 0 ; 
        int b = 1 ; 

        while( b<= target){
            int c = a+ b ; 
            if( c == target ){
                return true ; 
            }else if( c > target ){
                return false ; 
            }
            a = b ; 
            b = c ; 
        }
        return true ; 
        
    }
}