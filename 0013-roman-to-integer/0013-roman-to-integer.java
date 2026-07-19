class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>() ; 
        map.put('I' , 1) ; 
        map.put('V' , 5) ; 
        map.put('X' , 10) ; 
        map.put('L' , 50) ; 
        map.put('C' , 100) ; 
        map.put('D' , 500) ; 
        map.put('M' , 1000); 
        int ans = 0 ; 
        int i = 0 ; 
      if( s.length() == 1){
        return map.get(s.charAt(0)); 
      }
       while( i < s.length()-1){
             char  c = s.charAt(i) ; 
             char d = s.charAt(i+1); 
             int p = map.get(c) ; 
             int q = map.get(d); 
             if( p>=q ){
                ans += p ; 
                i++; 
             }else{
                int m = q - p ; 
                ans +=m ; 
                i+=2 ; 
             }
        }
        // char b = s.charAt(s.length()-2) ; 
        // char c = s.charAt(s.length()-1); 
        // int x = map.get(b); 
        // int t = map.get(c); 
        // if( x >= t ){
        //     ans += t ; 
        // }
        if( i<s.length()){
        int last = map.get(s.charAt(i)); 
        ans+=last ; 
        }
        return ans ; 
        
    }
}