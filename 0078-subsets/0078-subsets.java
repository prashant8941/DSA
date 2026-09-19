class Solution {
    public static void find( int[]arr , List<List<Integer>>ans , List<Integer>temp , int ind ){
        if( ind == arr.length ){
            ans.add(new ArrayList<>(temp)); 
            return ; 
        }
        temp.add(arr[ind]); 
        find( arr , ans , temp , ind+1); 
        temp.remove(temp.size()-1); 
        find( arr , ans , temp , ind+1); 

    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length ; 
        List<List<Integer>>ans = new ArrayList<>(); 
        List<Integer>temp = new ArrayList<>(); 
        find( nums , ans , temp ,  0); 
        return ans ; 
        
    }
}