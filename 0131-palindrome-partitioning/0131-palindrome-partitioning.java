class Solution {
    public static boolean palind(String s ){
        int i =  0 ; 
        int j = s.length()-1 ; 
        while( i <= j ){
            if( s.charAt(i) != s.charAt(j))return false ; 
            i++ ; 
            j-- ; 
        }
        return true ; 
    }
    public static void find(List<List<String>>ans , List<String>temp , int ind , String s ){
        if(ind == s.length()){
            ans.add(new ArrayList<>(temp)); 
            return ; 
        }
        for( int i = ind ;i  < s.length() ; i++){
            String  ss = s.substring(ind , i+1); 
            if( palind(ss)){
                temp.add(ss); 
             find(ans , temp , i+1 , s); 
            temp.remove(temp.size()-1); 
            }
 
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>ans  = new ArrayList<>(); 
        List<String>temp = new ArrayList<>(); 
        find( ans , temp , 0 , s ); 
        return ans ; 
        
    }
}