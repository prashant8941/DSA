class Solution {
    public int maxSum(int[] nums) {
        int n = nums.length ; 
        if( n == 1 ){
            return nums[0]; 
        }
        Arrays.sort(nums); 
        int max = nums[n-1]; 
        if( max < 0 )return max ; 
        int sum = 0 ;
        List<Integer>list = new ArrayList<>();  
        for( int ele : nums ){
            if( ele >0  && !list.contains(ele ) ){
                sum+=ele ;
                list.add(ele);  
            }
        }
        return sum ; 

        
    }
}