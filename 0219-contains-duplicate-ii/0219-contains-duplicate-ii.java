class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length ; 
        HashMap<Integer , List<Integer>>map = new HashMap<>(); 
        boolean ans = false ; 
        for( int i= 0 ;i < n ;i++){
            int ele = nums[i]; 
            if( map.containsKey(ele)){
                List<Integer>temp = map.get(ele); 
                for( int el : temp ){
                    if( Math.abs( el - i) <= k ){
                        ans = true ; 
                        break  ;
                    }
                }
            }
            map.computeIfAbsent(ele , s->new ArrayList<>()).add(i); 
        }
        return ans ; 
        
    }
}