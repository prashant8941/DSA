class Solution {
    public boolean checkString(String s) {
        int n = s.length(); 
        int[]last = new int[2]; 
        last[0] =-1 ; 
        last[1] = -1 ; 
        boolean cond = true ; 
        for( int i =0 ;i < n ;i++){
            char ch = s.charAt(i); 
            if( ch == 'a'){
                last[ch-'a']= i ; 
            }else{
                if(cond){
                    last[ch-'a'] = i ; 
                    cond = false ; 
                }
            }
        }
        if(last[0] < last[1]){
            return true ; 
        }else if( last[0] == -1 || last[1] == -1 ){
            return true ; 
        }
        return false ; 

        
    }
}