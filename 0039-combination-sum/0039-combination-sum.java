class Solution {
    public static void find( List<List<Integer>>ans , List<Integer>temp , int[]arr , int ind  , int target ){
        if( target == 0  ){
                ans.add(new ArrayList<>(temp)); 

            return ; 
            
        }
        if( target < 0 || ind == arr.length ){
            return ;
        }
        temp.add(arr[ind]); 
        find(ans , temp , arr , ind , target-arr[ind]); 
        temp.remove(temp.size()-1); 
        find( ans , temp , arr , ind+1 , target); 
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n = candidates.length ;
        List<List<Integer>>ans = new ArrayList<>() ; 
        List<Integer>temp = new ArrayList<>() ; 
         find( ans , temp , candidates , 0 , target); 
         return ans ; 

        
    }
}