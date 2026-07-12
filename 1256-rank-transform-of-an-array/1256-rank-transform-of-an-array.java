class Solution {
    public int[] arrayRankTransform(int[] s) {
        int  n = s.length; 
        if( n == 0 ){
           return new int[0]; 
        }
        HashMap<Integer, Integer>map = new HashMap<>(); 
        int[]arr = new int[n]; 
        int ind = 0 ; 
        for( int ele : s ){
            arr[ind++] = ele ; 
        }
        Arrays.sort(arr); 
        int rank = 1 ; 
   
        map.put(arr[0] , rank ); 
        for(int i = 1 ;i < n; i++ ){
            if( arr[i] >arr[i-1]){
                rank++ ; 
               
            }
             map.put(arr[i] , rank); 
        }
        int[]ans = new int[n]; 
        int in = 0 ; 
        for( int ele : s ){
            ans[in++] = map.get(ele); 
        }
        return ans; 
        
    }
}