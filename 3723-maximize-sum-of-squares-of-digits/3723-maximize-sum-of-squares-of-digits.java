class Solution {
    public String maxSumOfSquares(int num, int sum) {
        List<Integer>list = new ArrayList<>(); 
        while( num --> 0  ){
            for( int i = 9 ;i >= 0 ; i--){
                if( i <= sum ){
                    list.add(i);
                    sum-=i;  
                    break ; 
                }

            }
        }
        // if( list.isEmpty())return ""; 
        StringBuilder sb = new StringBuilder(); 
        for( int ele : list ){
            sb.append(ele); 
        }
        return sum == 0 ? sb.toString(): ""; 
        
    }
}