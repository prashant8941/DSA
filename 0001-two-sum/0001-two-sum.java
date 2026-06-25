class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length ; 
        int[]ans = new int[2] ; 
        Arrays.fill( ans , -1); 
        HashMap<Integer , Integer>map = new HashMap<>() ; 
      for( int i = 0 ;i  < n ;i++){
        int ele = nums[i] ; 
        if( map.containsKey( target - ele )){
            ans[0] = map.get(target - ele ); 
            ans[1] =  i ; 
            break ; 
        }else {
            map.put( ele , i ); 
        }

      }
      return ans ; 
        
    }
}