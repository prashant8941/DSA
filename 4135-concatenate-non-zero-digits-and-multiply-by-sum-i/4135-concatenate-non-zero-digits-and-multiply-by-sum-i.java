class Solution {
    public long sumAndMultiply(int n) {
        long num = 0 ; 
        long sum = 0 ;
        while( n!= 0 ){
            int digit = n %10; 
            if( digit != 0 ){
                sum+=digit ; 
                num = num*10 + digit ; 
             
            }
            n/= 10 ; 
           

        }
        long num2 = 0 ; 
        while( num != 0 ){
            long dg = num%10 ; 
            num2 = (num2*10 ) +dg ; 
            num/= 10 ; 
        }
        return num2*sum ; 

        
    }
}