class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length(); 
        List<Integer>list = new ArrayList<>(); 
  
        int ans = 0 ; 
        for( char ch : s.toCharArray()){
            if( ch == '1')ans++ ; 
        }
        int count = 0 ; 
        for( int i = 0 ;i < n; i++){
            char ch = s.charAt(i); 
            if( ch =='0'){
                count++ ; 
            }else{
               if( count > 0 ) {list.add(count); 
                count = 0  ; 
               }
            }
        }
        if( count > 0 )list.add(count); 
        if(list.size() <= 1)return ans ; 


        int max = 0 ;
        for( int i = 1 ;i < list.size() ; i++){
           int  val = list.get(i)+list.get(i-1); 
            max = Math.max( max , val ); 

        }
        return ans + max ; 
        
    }
}