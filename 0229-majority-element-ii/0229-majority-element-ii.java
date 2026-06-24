class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length ; 
        int freq = n/ 3 ; 
        int ans =  0 ; 
        List<Integer>list = new ArrayList<>(); 
        HashMap<Integer, Integer>map = new HashMap<>(); 
        for(  int ele : nums ){
            map.put( ele  , map.getOrDefault( ele , 0 )+1) ; 
            int fr= map.get(ele); 
            if( fr > (n/3) && (!list.contains(ele))  ){
                list.add(ele); 
            }
        }
        return list ; 
        
    }
}