class Solution {
    public int totalFruit(int[] fruits) {
        int n  = fruits.length ; 
        HashMap<Integer , Integer>map = new HashMap<>(); 
        int l = 0 ;
        int max = 0 ;  
        for( int i = 0 ;i < n ;i++){
            int ele = fruits[i]; 
            map.put( ele , map.getOrDefault( ele , 0 )+1); 
            while( map.size()> 2 ){
                if( map.get(fruits[l]) == 1 ){
                    map.remove(fruits[l]); 
                }else{
                    map.put( fruits[l] , map.get(fruits[l])-1); 
                }
                l++ ; 

            }
            max = Math.max( max , i-l+1); 

        }
        return max ; 
        
    }
}