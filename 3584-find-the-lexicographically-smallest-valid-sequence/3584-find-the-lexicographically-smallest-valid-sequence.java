class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(); 
        int m = word2.length(); 
        // making the suffix array to make sure the that we have the sufficient element after this 
        int[]suff = new int[n+1]; 
        int j = m-1  ; 
        for( int i = n-1 ; i>= 0 ; i--){
           suff[i] = suff[i+1]; 
           if(j>= 0 &&  word1.charAt(i) == word2.charAt(j)){
            suff[i]++ ; 
            j-- ; 
           }


        }
        int[]ans = new int[m]; 
        int k =  0 ; 
        boolean pow = false ; 
        for( int i = 0 ;i < n && k < m ;i++){
            if(word1.charAt(i) == word2.charAt(k)){
                ans[k] = i ; 
                k++ ; 
            }else if( !pow ){
                int rem = m-k-1 ; 
                if(suff[i+1]>= rem ){
                    ans[k] = i ; 
                    k++ ; 
                    pow = true ; 
                }
            }

        }
        if( k!= m ){
            return new int[]{}; 
        }
        return ans ;
        
    }
}