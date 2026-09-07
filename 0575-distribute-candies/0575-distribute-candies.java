class Solution {
    public int distributeCandies(int[] candyType) {
        int max = candyType.length/2; 
        HashSet<Integer>set = new HashSet<>(); 
        for( int ele : candyType){
            set.add(ele); 
        }
        if( set.size()<  max ){
            return set.size(); 
        }
        return max ; 
        
    }
}