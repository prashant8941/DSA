class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length ; 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(); 
        for( int i = 0 ;i < n ;i++) {
 
            maxHeap.add(nums[i]); 
        }
        while(maxHeap.size() > k ){
            maxHeap.poll(); 
        }
        return maxHeap.peek(); 
        
    }
}