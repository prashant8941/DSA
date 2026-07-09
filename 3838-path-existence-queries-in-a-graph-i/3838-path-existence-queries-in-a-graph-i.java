class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
        int comp[] = new int[n]; 
        for( int i = 1 ;i < n ;i++){
            if(nums[i] - nums[i-1] <= maxDiff ){
                comp[i] = comp[i-1]; 
            }else{
                comp[i] = i ; 
            }
        }
        boolean  ans[]  = new boolean[queries.length]; 
        for( int i = 0 ;i < queries.length ; i++){
            int l = queries[i][0]; 
            int r = queries[i][1]; 
            if( comp[l] == comp[r]){
                ans[i]= true ; 
            }else{
                ans[i] = false ; 
            }
        }
        return ans; 
        
    }
}