class Solution {
    public int minQueenMoves(int[] source, int[] target) {
        int a  = source[0]; 
        int b =  source[1]; 

        int c =  target[0]; 
        int d =  target[1]; 
        if( a-c == 0 && b-d == 0 )return 0 ; 
        if( Math.abs(a-c) == 0  ||  Math.abs(b-d) == 0 || (Math.abs(a-c) == Math.abs(b-d)) )return 1 ; 
        return 2 ; 

        

    }
}