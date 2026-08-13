class Solution {
    public static boolean valid( String s ){
        int i =  0  ; 
        int j = s.length()-1; 
        while(i< j ){
            if( s.charAt(i) != s.charAt(j)){
                return false ; 
            }
            i++ ; 
            j-- ; 
        }
        return true ; 
    }
    public static void find(List<List<String>>list,List<String>temp ,  String s , int ind ){
        if(ind == s.length()){
            list.add(new ArrayList<>(temp)); 
            return ; 
        }
        for( int i = ind ; i < s.length()  ; i++){
            String sub = s.substring(ind , i+1); 
            if( valid(sub)){
                temp.add(sub); 
                find(list , temp , s , i+1); 
                temp.remove(temp.size()-1); 
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>>list = new ArrayList<>(); 
        List<String>temp = new ArrayList<>(); 
        find( list ,temp ,  s   , 0 ); 
        return list; 
        
    }
}