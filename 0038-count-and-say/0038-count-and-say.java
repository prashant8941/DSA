class Solution {
    public String countAndSay(int n) {
        String  s = "1";
        if(n == 1 )return s ; 
        s+="1"; 
        for( int i = 1 ;i < n-1 ;i++){
            int count = 1 ; 
            String temp = ""; 
            boolean last  = false ; 
            for( int j = 1 ; j< s.length() ; j++){
                if(  s.charAt(j)  == s.charAt(j-1) ){
                    count++ ; 
                }else{
                    if( j == s.length()-1)last = true ; 
                    String ad = String.valueOf(count);  
                    char  sa = s.charAt(j-1); 
                    temp+=ad ; 
                    temp+=sa ; 
                    count = 1 ; 
                }
            }
            if(  count > 1|| last  ){
                String  d = String.valueOf(count); 
            char sd = s.charAt(s.length()-1); 
                temp+=d ; 
                temp+=sd ; 
            }
            s = temp  ; 
            
        }
        return s; 
        
    }
}