class Solution {
    class Pair{
        int cap ; 
        int have ; 
        int req ; 
        Pair( int cap , int have , int req ){
            this.cap = cap ; 
            this.have = have ; 
            this.req = req; 
        }
    }
    public int maximumBags(int[] capacity, int[] rocks, int ar ) {
        int n = capacity.length ; 
        Pair[]arr = new Pair[n]; 
        for( int i = 0 ;i < n ;i++){
            arr[i] = new Pair( capacity[i] , rocks[i] , capacity[i]-rocks[i]); 
        }
        Arrays.sort(arr , (x,y )->Integer.compare(x.req , y.req)); 
        int count = 0 ; 
        for( int i = 0 ;i < n; i++){
            Pair p = arr[i]; 
            int cap = p.cap ; 
            int have = p.have ; 
            int req = p.req ; 
            if( req <= ar ){
                count++ ; 
                ar-=req ; 
            }else{
                break ; 
            }
        }
        return count ; 


        
    }
}