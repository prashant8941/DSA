class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort( nums) ; 
        int n  = nums.length ; 
        List<List<Integer>>ans = new ArrayList<>() ; 
        long ssum = 0 ; 
        for( int ele : nums ){
            ssum+= ele ; 
           
        }
        if( n == 4  &&(  ssum > target || ssum < target ) ){
            return ans ; 
        }
        for( int i = 0 ;  i <  n-3 ;i++){
        
            for( int j = i+1 ; j < n-2 ;j++){
                   
                int left = j+1  ; 
                int right = n-1 ; 
                while( left < right  ){
                     List<Integer>temp = new ArrayList<>() ; 
                    int sum = nums[i] + nums[j] + nums[left] + nums[right] ; 
                    if( sum < target ){
                        left++ ; 
                    }else if( sum > target ){
                        right -- ; 
                    }else{
                        temp.addAll(Arrays.asList(nums[i] , nums[j] , nums[left] ,  nums[right]) ); 
                        if( !ans.contains(temp)){
                        ans.add(temp) ; 
                        }
                        left++ ; 
                        right -- ; 

                    }

                }
            }
        }
        return ans ; 

        
    }
}