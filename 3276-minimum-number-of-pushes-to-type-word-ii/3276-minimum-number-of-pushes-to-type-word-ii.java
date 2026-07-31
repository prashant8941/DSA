class Solution {
    class Pair{
         char a ; 
         int b ; 
         Pair( char a , int b){
            this.a = a ; 
            this.b =  b ; 
         }
    }
    public int minimumPushes(String word) {
       HashMap<Character  , Integer > mp = new HashMap<>(); 
       for(  char ch : word.toCharArray()){
        mp.put(ch , mp.getOrDefault(ch , 0 )+1); 
       }
       Pair arr[] = new Pair[mp.size()]; 
       int ind = 0 ; 
    for(Map.Entry<Character , Integer > entry: mp.entrySet()){
        arr[ind++] = new Pair(entry.getKey() , entry.getValue()); 
    }
    Arrays.sort(arr , (x , y )-> Integer.compare(y.b , x.b)); 
      
        HashMap<Character , Integer > map = new HashMap<>(); 
        for( int i = 0 ;i < arr.length ; i++){
            Pair p = arr[i]; 
            char ch = p.a ; 
            int val = p.b ; 
            if( i < 8 ){
                map.put(ch   , 1 ); 
            }else if( i>= 8 && i < 16 ){
                map.put(ch , 2 ); 
            }else if( i>= 16 && i < 24 ){
                map.put(ch , 3); 
            }else{
                map.put(ch, 4 ); 
            }

        }
        int ans = 0 ; 
        for( char ch : word.toCharArray()){
            ans+=map.get(ch); 
        }
        return ans ; 
        
    }
}