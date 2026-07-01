class Solution {
    public static void find( List<List<Integer>>ans , List<Integer>temp , int[]arr , int ind  , int target ){
        if( target == 0  ){
           
                ans.add(new ArrayList<>(temp)); 
            
            return ; 
            
        }
        for( int i = ind ; i<arr.length ; i++){
            if( i > ind && arr[i] == arr[i-1])continue; 
            if( arr[i] > target)break; 
            temp.add(arr[i]); 
            find(ans , temp , arr , i+1 , target-arr[i]); 
            temp.remove(temp.size()-1); 
        }
       
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
         int n = candidates.length ;
        List<List<Integer>>ans = new ArrayList<>() ; 
        List<Integer>temp = new ArrayList<>() ; 
          Arrays.sort(candidates); 
         find( ans , temp , candidates , 0 , target); 
      
         return ans ; 
        
        
    }
}