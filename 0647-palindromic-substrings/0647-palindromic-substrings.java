class Solution {
    int count = 0 ; 
    public int countSubstrings(String s) {
        int n = s.length(); 
        for( int i = 0 ;i < n ;i++){
            // for odd length ;
            int left = i ; 
            int right =i ;
            while( left >= 0 && right < n ){
                if( s.charAt(left) == s.charAt(right)){
                    count++ ; 
                }else{
                    break; 
                }
                left-- ; 
                right++ ; 
            }
            int lef = i ; 
            int rig = i+1 ; 
            while( lef>= 0 && rig< n ){
                if(s.charAt(lef) == s.charAt(rig)){
                    count++ ; 
                }else{
                    break ; 
                }
                lef-- ; 
                rig++ ; 
            }

        }
        return count ; 
        
    }
}