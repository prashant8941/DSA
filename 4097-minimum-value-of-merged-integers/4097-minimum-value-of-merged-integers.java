class Solution {
    public int minMergedInteger(int[] nums) {
        int n = nums.length ; 
        List<Long>list  = new ArrayList<>(); 
        for( int i = 0 ;i < n ;i+=2 ){
            String a = String.valueOf(nums[i]); 
            String b = String.valueOf(nums[i+1]); 
            String c = a+b ; 
            long val =Long.parseLong(c); 
            list.add(val); 

        }
        long max  =  (long)1e16 ; 
        for(long ele : list  ){
            max = Math.min( max , ele ); 
        }
        return (int)max ; 
        
    }
}