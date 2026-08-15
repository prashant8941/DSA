class Solution {
    class Pair{
        int s ; 
        int e ; 
        int profit ; 
         Pair(int s , int e , int profit ){
            this.s = s; 
            this.e = e ;  
            this.profit = profit ; 
        }
    }
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n  = startTime.length ; 
        Pair[]arr = new Pair[n]; 
        for( int i = 0 ;i < n; i++){
            arr[i] = new Pair(startTime[i] , endTime[i] , profit[i]); 
        }
        Arrays.sort(arr , (x,y)->{
        if( x.s != y.s){
       return   Integer.compare(x.s, y.s); 
        }else{
            return Integer.compare(y.profit , x.profit ); 
        }
    }); 
       int dp[] = new int[n]; 
       Arrays.fill(dp , -1); 
       return find( 0 , arr , dp ); 
    }
    public static int find( int i , Pair[]arr , int[]dp ){
        if( i >= arr.length ){
            return 0 ; 
        }
        if( dp[i] != -1 ){
            return dp[i]; 
        }

        int next = binarySearch(arr[i].e, arr ); 
        // take current
        int take = arr[i].profit  + find(next, arr , dp ); 
        // int skip 
        int skip = find(i+1, arr , dp ); 
        return dp[i] = Math.max(take , skip );  

    }
    public static int binarySearch(int endTime , Pair arr[] ){
        int l = 0 ; 
        int r = arr.length -1 ; 
        int ans = arr.length ; 
        while( l<= r ){
            int mid = l+ (r-l)/2 ; 
            if(arr[mid].s >= endTime){
                ans = mid ; 
                r = mid-1 ; 
            }else{
                l= mid+1 ; 
            }
        }
        return ans ; 
    }
}