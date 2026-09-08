class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length ;
        Arrays.sort(skill);  
    long  ans = 0 ;
        int i = 0 ; 
        int j = n -1 ;
        long  tar = skill[i]+skill[j];  
        while( i < j ){
        long  val = skill[i]*skill[j]; 
            long  chek = skill[i]+skill[j]; 
            if( chek != tar){
                return -1 ; 
            }
            ans+=val ;
            i++ ; 
            j-- ; 
        }
        return ans ;
        
    }
}