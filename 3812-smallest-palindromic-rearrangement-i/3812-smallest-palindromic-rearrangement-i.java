class Solution {
    public String smallestPalindrome(String s) {
        int []freq = new int[26]; 
        for(char ch : s.toCharArray()){
            freq[ch-'a']++; 
        }
        StringBuilder sb = new StringBuilder();
        int odd = -1 ; 
        for( int i = 0 ;i < 26 ; i ++){
            if( freq[i] %2 != 0 ){
                odd  =i  ; 
                freq[i]-- ; 
                break ; 
            }
        }

        for( int i = 0 ;i < 26 ; i++){
            if( freq[i]%2 == 0 ){
                for( int j = 0 ;j<freq[i]/2 ; j++){
                    sb.append( (char) ('a'+i )  ); 
                }
            }

        }
          for( int i = 25 ;i >= 0  ; i--){
            if( freq[i]%2 == 0 ){
                for( int j = 0 ;j <freq[i]/2 ; j++){
                    sb.append( (char) ('a'+i )  ); 
                }
            }

        }
        if(odd != -1 ){
        char sub = (char)('a'+odd); 
       
            sb.insert((sb.length())/2 , sub); 
        }

        String ret = new String(sb); 
        return ret ; 
        
    }
}