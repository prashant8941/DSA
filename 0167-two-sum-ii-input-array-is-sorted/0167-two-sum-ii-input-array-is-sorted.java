class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length ; 
        HashMap<Integer, Integer>map = new HashMap<>(); 
        int[]ans = new int[2]; 
       for( int i = 0 ;i < n; i++){
          int ele = numbers[i]; 
          if( map.containsKey(target  - ele)){
            ans[0] = map.get(target - ele )+1; 
            ans[1] = i+1 ; 
            break ; 
          }
          map.put(ele , i ); 
       }
       return ans ;
        
    }
}