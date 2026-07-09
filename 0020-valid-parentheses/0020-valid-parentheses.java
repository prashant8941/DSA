class Solution {
    public boolean isValid(String s) {
       
        Stack<Character >q = new Stack<>(); 
        for( char ch : s.toCharArray()){
            if( ch == '(' || ch == '[' || ch == '{'){
                q.add(ch); 
            }else{
                        if (q.isEmpty()) {
                    return false;
                }
                char st = q.pop(); 
              if( ((st=='{' && ch!='}' ) || (st=='(' && ch!=')') || (st=='[' && ch !=']' )) ){
                return false ; 
              }
            }
        }
        return q.isEmpty(); 
        
    }
}