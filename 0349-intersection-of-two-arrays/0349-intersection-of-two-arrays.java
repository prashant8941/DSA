class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1); 
        Arrays.sort(nums2); 
        List<Integer>list  = new ArrayList<>(); 
        int n = nums1.length ; 
        int m = nums2.length ; 
        int i = 0 ; 
        int j =0 ; 
        while( i < n && j < m ){
            if(nums1[i] < nums2[j]){
                i++ ; 
            }else if( nums2[j]< nums1[i]){
                j++ ; 
            }else{
                if( list.size() == 0 || list.get(list.size()-1) != nums1[i]){
                    list.add(nums1[i]); 
 
                }
                    i++ ; 
                    j++ ;
            }
        }
        // return list ; 
        int[]ans = new int[list.size()]; 
        int ind = 0 ; 
        for( int ele : list ){
            ans[ind++] = ele ; 
        }
        return ans ; 

        
    }
}