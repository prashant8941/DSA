class Solution {
    class Pair {
        long  a ; 
        long  b ; 
        Pair( long  a , long  b ){
            this.a = a; 
            this.b = b ; 
        }
    }
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length ; 
        Pair[]arr = new Pair[n]; 
        for( int i = 0 ;i < n; i++){
            arr[i] = new Pair(nums1[i] , nums2[i]); 
        }
        Arrays.sort(arr , (x , y)-> Long.compare(y.b, x.b)); 
        PriorityQueue<Long>pq = new PriorityQueue<>(); 
        long sum =0 ; 
        long ans = 0 ; 
        for( int i  = 0 ; i < n ;i++){
            Pair p  = arr[i]; 
            pq.add(p.a); 
            sum+=p.a ; 
            if(pq.size()>k ){
                sum-=pq.poll(); 
            }
            if(pq.size() == k ){
                ans= Math.max( ans , (sum*p.b)); 
            }

        }
        return ans ; 
    

        
    }
}