class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length ; 
        int i = n-2 ;
        // finding the breaking point  
        while( i>= 0 && nums[i] >=  nums[i+1]){
            i-- ; 
        }
        // finding the element just greater than i 

        if( i >= 0 ){
            int j = n-1 ; 
            while( nums[j]<= nums[i])j-- ; 

            // swap i and j 
            int t= nums[i]; 
            nums[i] = nums[j]; 
            nums[j] = t ; 
        }
        // reverse every thing after i 
        int left = i+1 ; 
        int right = n-1 ; 
        while( left < right ){
            int t= nums[left]; 
            nums[left] = nums[right] ; 
            nums[right]= t; 
            left++ ; 
            right-- ; 
        }
        
    }
}