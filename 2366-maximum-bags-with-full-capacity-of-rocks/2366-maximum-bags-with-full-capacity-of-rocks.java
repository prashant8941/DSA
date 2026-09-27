class Solution {
    class Pair{
        int a; 
        int b ; 
        int c ; 
        Pair(int a , int b , int c ){
            this.a = a ; 
            this.b = b ; 
            this.c = c ; 

        }
    }
    public int maximumBags(int[] capacity, int[] rocks, int ar) {
        int n = capacity.length ; 
        Pair[]arr = new Pair[n]; 
        for( int i = 0 ;i < n ;i++){
            int  u = capacity[i]; 
            int v = rocks[i]; 
            int w = u-v ; 
            arr[i] = new Pair( u , v , w ); 
        }
        Arrays.sort(arr , (x , y )-> Integer.compare(x.c , y.c )); 
        int count = 0 ; 
        for( int i =0 ;i < n;i++){
            Pair p = arr[i]; 
            int cap = p.a ; 
            int roc = p.b ; 
            int want = p.c ; 
            if( want== 0 ){
                count++ ; 
            }else{
                if( ar >= want ){
                    count++  ; 
                    ar-= want ; 
                }

            }
        }
        return count ; 


        
    }
}