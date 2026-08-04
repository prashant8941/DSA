class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length ; 
        Arrays.sort(nums); 
        int a = nums[0]; 
        int b = nums[n-1]; 
        List<Integer>list = new ArrayList<>(); 
        for( int ele : nums ){
            list.add(ele); 
        }
        List<Integer>ans = new ArrayList<>(); 
        while(a!= b ){
            if(! list.contains(a)){
                ans.add(a); 
            }
            a++ ; 
        }
        return ans ; 


        
    }
}