class Solution {
    public boolean uniformArray(int[] nums) {
        int n = nums.length;  
        int Ocount = 0 ; 
        for( int i = 0; i < n ;i++){
            if( nums[i]%2 != 0 ){
                Ocount++ ; 
                continue ; 
            }
            for( int j  = 0 ;j < n ;j++){
                if( i == j ){
                    continue ; 
                }
                if( nums[i] -nums[j] % 2 != 0 ){
                    Ocount++ ; 
                    break ; 
                }

            }
        }
        if( Ocount == n )return true ; 

        int Ecount = 0 ; 
        for( int i = 0; i < n ;i++){
            if( nums[i]%2 == 0 ){
                Ecount++ ; 
                continue ; 
            }
            for( int j  = 0 ;j < n ;j++){
                if( i == j ){
                    continue ; 
                }
                if( nums[i] -nums[j] % 2 == 0 ){
                    Ecount++ ; 
                    break ; 
                }

            }
        }
        if( Ecount == n )return true ;
        return false ;  


        
    }
}