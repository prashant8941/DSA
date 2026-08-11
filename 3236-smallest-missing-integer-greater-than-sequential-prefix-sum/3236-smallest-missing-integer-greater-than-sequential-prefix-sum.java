class Solution {
    public int missingInteger(int[] nums) {
        int n   = nums.length ; 
        // if( n == 1 ){
        //     return nums[0]+1; 
        // }
        int sum = 0 ; 
        int max  = 0 ; 
        sum+=nums[0];
        max = sum ;  
        List<Integer>list = new ArrayList<>(); 
        for( int ele : nums ){
            list.add(ele); 
        } 
        for(int i = 1 ;i <n ;i++){
            if( nums[i] == nums[i-1]+1){
                sum+=nums[i]; 
                max = Math.max(max , sum); 
            }else{
                break ;  
            }

        }
        while(list.contains(max)){
            max++ ; 
        }
        return max ; 
        
        
    }
}