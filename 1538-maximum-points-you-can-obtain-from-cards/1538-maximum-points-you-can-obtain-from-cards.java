class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length ; 
        int s = 0 ; 
        for( int ele : cardPoints){
            s+=ele  ; 
        }
        if(k == n )return s; 
        int[]prefix = new int[n+1]; 
        prefix[0] = 0 ;
        for( int i = 1 ;i <= n ;i++){
            prefix[i] = prefix[i-1]+cardPoints[i-1]; 
        }
        int  max = 0 ; 
      for( int i = 0 ;i <=  k ; i++){
        int f  = prefix[i]- prefix[0]; 
        int l = prefix[n] - prefix[n-k+i];
        max = Math.max( max , f+l); 


      }
      return max ; 

        
    }
}