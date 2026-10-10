class Solution {
    public static void find( List<List<Integer>>ans , List<Integer>temp , int[]nums , boolean[]used ){
        if( temp.size() == nums.length){
            ans.add(new ArrayList<>(temp)); 
            return ; 
        }
        for( int i = 0 ;i < nums.length ; i++){
            if( used[i] == false ){
                temp.add(nums[i]); 
                used[i] = true ; 
                find(ans , temp , nums , used ); 
                used[i] = false ; 
                temp.remove(temp.size()-1); 
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length ; 
        boolean[]used = new boolean[n]; 
        List<List<Integer>>ans = new ArrayList<>(); 
        List<Integer>temp = new ArrayList<>(); 

        find( ans , temp , nums ,used ); 
        return ans ;  
        
    }
}