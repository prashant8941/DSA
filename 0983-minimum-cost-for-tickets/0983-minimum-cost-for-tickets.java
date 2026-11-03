class Solution {
    public static int find(int[]dp , int[]days , int cost[] , int ind ){
        if( ind == days.length){
            return   0  ; 
        }
        if( dp[ind]!= -1 )return dp[ind]; 
        int profit = (int)1e9 ; 
        for( int i = ind ;i < days.length ; i++){
            int ds =( days[i]- days[ind])+1 ; 
            int val = (int)1e9; 
            int one = cost[0]+find(dp , days , cost , ind+1); 
            int j =  ind ; 
            while( j < days.length  && days[j] < days[ind]+7){
                j++ ; 
            }
            int seven = cost[1]+find(dp , days , cost , j ); 
            j = ind ; 
            while( j< days.length && days[j]<days[ind]+30){
                j++ ; 
            }
            int thirty  = cost[2] + find( dp , days , cost , j ); 
            return dp[ind] = Math.min( one , Math.min( seven , thirty )); 
        }
        return dp[ind] = profit ; 

    }
    public int mincostTickets(int[] days, int[] costs) {
        int n =days.length ; 
        int[]dp = new int[n]; 
      Arrays.fill(dp , -1); 
        return find( dp , days , costs , 0 ); 

        
    }
}