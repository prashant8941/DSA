class Solution {
    public boolean sumGame(String num) {
        int n = num.length() ; 
        int[]arr = new int[n]; 
        int left = 0 ; 
        int right = 0 ; 
        for( int i = 0 ;i < n;i++){
            char ch = num.charAt(i); 
            if( ch == '?'){
                arr[i] = 0 ; 
            }else{
                arr[i] = ch-'0'; 
                if( i >= (n/2 )){
                    right+=arr[i]; 
                }else{
                    left+=arr[i]; 
                }
            }
        }
        boolean turn = true  ; 
        for( int i = 0 ;i <n ;i++){
            if( num.charAt(i) == '?'){
                if( turn ){
                    if( i <(n/2 )){
                    if( left >= right ){
                        left+=  9 ; 
                    } 
                    }else{
                        if( right>=left  ){
                            right+=9 ; 
                        }
                    }
                    turn  = false ;
                   
                }else{
                    if( i <(n/2)){
                    if( left < right ){
                        left+=9 ;

                    } 
                    }else{
                        if( right<left ){
                            right+=9 ; 
                        }
                    }
                    turn = true ; 
                }

            }
        }
        if( left == right ){
            return false ; 
        }
        return true ; 
       

        
    }
}