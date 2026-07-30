class Solution {
    public int minimumPushes(String word) {
        int n = word.length(); 
        if( n<= 8){
            return n ; 
        }
        int count = 8 ; 
        for( int i = 8 ; i <n ;i++ ){
            if( i >= 8&& i < 16  ){
                count+=2 ; 
            }
             if(i >= 16 && i < 24  ){
                count+= 3; 
            }
            if( i >=24){
                count+= 4 ; 

            }
        }
        return count  ; 
        
    }
}