class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length]; 
        int right[] = new int[height.length]; 
        int l = 0 ; 
        int r = 0 ; 
        for( int i = 0 ; i<height.length ; i++){
            if( height[i] > l){
                l = height[i]; 
            }
            left[i] = l ; 
        }

        for( int i = height.length -1 ; i>= 0 ; i--){
            if( height[i]> r ){
                r = height[i];
            }
            right[i] = r ; 
        }

        int ans = 0  ; 
        for( int i = 0 ; i< height.length ;i++){
            ans += Math.min(left[i], right[i]) - height[i]; 
        }
        return ans ; 
        
    }
}