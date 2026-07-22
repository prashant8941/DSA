class Solution {
    public static void find(List<String>ans ,String s , int open , int close , int n   ){

        if( open== n && close== n   ){
            ans.add(s); 
        }
        if(open < n ){
            find(ans , s+"(" , open+1 , close , n  ); 
        }
        if(close <  open ){
            find( ans , s+")" , open  , close+1 , n ); 
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>(); 
        find( ans , ""  , 0  , 0 , n ); 
        return ans ;
        
    }
}