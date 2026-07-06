class Solution {
    class Pair {
        int a;
        int b;

        Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length ;
        Pair[]arr = new Pair[n]; 
        for( int i = 0 ;i < n; i++){
            int a = intervals[i][0]; 
            int b = intervals[i][1]; 
            arr[i] = new Pair( a , b); 

        }
        int count = 0 ; 
        for( int i =  0 ;i < n; i++){
            for( int j = 0 ;j < n; j++){
                if( i == j )continue; 
                Pair p  = arr[i]; 
                int a  = p.a ; 
                int b = p.b ; 
                Pair s = arr[j]; 
                int c = s.a ; 
                int d = s.b; 
                if( c<=a && b<= d ){
                    count++ ; 
                    break ; 
                }

            
            }
        }
         
 



     
        return n - count ; 

        
    }
}