class Solution {
    public boolean canAliceWin(int n) {
        int rem = 10 ; 
        boolean alice = true ; 

        while( n != 0 ){
            if( alice){
                if( n<rem){
                    return false ; 
                }else{
                    n-= rem ; 
                    rem-- ; 
                }
                alice = false ; 
            }else{
                if( n < rem ){
                    return true  ; 
                }else{
                    n-=rem ; 
                    rem-- ;
                }
                alice = true  ; 

            }


        }
       if( alice)return false ; 
       return true ; 
        
    }
}