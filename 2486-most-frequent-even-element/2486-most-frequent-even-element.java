class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length ; 
          TreeMap<Integer , Integer > map = new TreeMap<>() ; 
          for( int ele : nums ){
            map.put( ele , map.getOrDefault( ele , 0 )+1)  ; 
          }
          int ans = -1 ; 
          int val = 0 ; 
          for( Map.Entry<Integer , Integer > entry : map.entrySet()){
            if(entry.getKey() % 2 == 0   && entry.getValue() >  val ){
                ans  = entry.getKey() ; 
                val = entry.getValue(); 
            }
          }
          return ans ; 


        
    }
}