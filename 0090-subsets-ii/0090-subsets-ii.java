class Solution {
    public static void find( int[]arr , int ind , Set<List<Integer>>ans , List<Integer>temp){
        if( ind == arr.length ){
            // Collections.sort(temp); 
            if(! ans.contains(temp)){
            ans.add(new ArrayList<>(temp)); 
             
            }
               return ; 
        
        }
        temp.add(arr[ind]); 
        find( arr , ind+1 , ans , temp); 
        temp.remove(temp.size()-1); 
        find( arr , ind+1 , ans , temp) ; 
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>>ans  = new HashSet<>() ; 
        List<Integer>temp = new ArrayList<>() ; 
        find( nums , 0 , ans , temp); 
    
        List<List<Integer>>ret  = new ArrayList<>(); 
        for(List<Integer>s : ans){
            Collections.sort(s); 
            if( !ret.contains(s)){
            ret.add(s); 
            }
        }
        return ret ;
        
    }
}