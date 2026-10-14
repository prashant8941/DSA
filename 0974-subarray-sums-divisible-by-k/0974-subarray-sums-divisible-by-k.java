class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n  = nums.length ; 
        HashMap<Integer , Integer>map=  new HashMap<>();
        map.put( 0 , 1 ); 
        int count = 0 ; 
        int sum = 0 ;  
        for(int i = 0 ;i < n; i++){
            int ele = nums[i]; 
            sum+=ele  ;
             int req = ((sum % k) + k) % k;
            if(map.containsKey(req) ){
                count+=map.get(req); 
            }
            map.put( req , map.getOrDefault(req , 0 )+1); 
            
        }
        return count ; 
        
    }
}