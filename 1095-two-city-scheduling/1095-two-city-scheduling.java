class Solution {
    class Pair{
        int a ; 
        int b ; 
        int dif ; 
        Pair(int a , int b , int dif ){
            this.a = a ; 
            this. b = b ; 
            this.dif = dif ; 
        }
    }


    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length ; 
        Pair[]arr = new Pair[n]; 
        for( int i =0 ;i < n ;i++){
            int u = costs[i][0]; 
            int v = costs[i][1]; 
            arr[i] = new Pair(u , v , u-v); 
            
        }
        Arrays.sort(arr , (x , y )-> Integer.compare(x.dif , y.dif)); 
        int sum = 0 ; 
        for( int i = 0 ;i < n ;i++){
            Pair p = arr[i]; 
            int u = p.a ; 
            int v = p.b ; 
            if( i < n/2 ){
                sum+=u ; 

            }else{
                sum+=v ; 
            }
        }
        return sum ; 
       

        
    }
}