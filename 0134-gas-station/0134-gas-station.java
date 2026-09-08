class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length ; 
        int sum = 0 ; 
        int temp = 0 ; 
        int ind = 0  ; 
        for( int i = 0 ;i < n ; i++){
            sum+=gas[i]-cost[i]; 
            temp+=gas[i]-cost[i]; 
            if( temp < 0 ){
                temp = 0 ; 
                ind = i+1; 
            }
        }
       return sum>= 0 ? ind : -1 ; 
        
    }
}