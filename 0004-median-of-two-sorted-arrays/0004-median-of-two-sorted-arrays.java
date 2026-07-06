class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Double>list = new ArrayList<>(); 
        for( int ele : nums1){
            list.add((double)ele); 
        }
        for( int ele : nums2){
            list.add((double)ele); 
        }
        Collections.sort(list); 
             int mid = list.size()/2 ; 
        if(list.size() % 2 == 0 ){
       
            double ans =( list.get(mid-1)+list.get(mid))/2.0 ; 
            return ans ; 
        }else {
            return list.get(mid); 

        }

        
    }
}