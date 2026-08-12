class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length ; 
        int l = 0 ; 
        int max = 0 ; 
        HashMap<Integer, Integer>map = new HashMap<>(); 
        for( int i = 0 ;i < n ;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0 )+1); 
            if( map.get(nums[i]) <= k ){
                max = Math.max(max , i-l+1); 
            } else{
                while( (nums[l] != nums[i]) ){
                    if( map.get(nums[l]) > 1 ){
                        map.put(nums[l] , map.get(nums[l])-1); 
                    }else if( map.get(nums[l]) == 1 ){
                        map.remove(nums[l]); 
                    }
                    l++ ; 
                }
                if( map.get(nums[l])> 1 ){
                    map.put(nums[l] , map.get(nums[l])-1); 
                }else{
                    map.remove(nums[l]); 
                }
                l++ ; 
                
            }


        }
        return max ; 
        
    }
}