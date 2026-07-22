class Solution {
    public static void find(List<List<Integer>>ans , List<Integer>temp , int []nums , int ind ){
        if( ind ==  nums.length){
            ans.add(new ArrayList<>(temp)); 
            return ; 
        }
        temp.add(nums[ind]); 
        find( ans , temp , nums , ind+1); 
        temp.remove(temp.size()-1); 
        find( ans , temp , nums , ind+1); 
    }
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length ; 
        List<List<Integer>>ans = new ArrayList<>(); 
        List<Integer>temp = new ArrayList<>(); 
        find( ans ,temp , nums , 0  ); 
        return ans ; 
        
    }
}