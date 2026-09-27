class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int n = nums.length ;
        PriorityQueue<Integer>pq = new PriorityQueue<>(); 
        for( int ele : nums ){
            pq.add(ele); 
        }
        while(k--> 0 ){
            int ele = pq.poll(); 
            ele*=-1 ; 
            pq.add(ele) ; 
        }
        int ans = 0 ; 
        while( !pq.isEmpty()){
            ans+=pq.poll(); 
        }
        return ans; 
        
    }
}