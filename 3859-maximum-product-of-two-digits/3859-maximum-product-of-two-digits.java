class Solution {
    public int maxProduct(int n) {
        int max = 0 ; 
        int smax = 0 ; 
        List<Integer>list = new ArrayList<>(); 
        while( n!= 0 ){
            int ele =  n%10 ; 
            list.add(ele); 
            n/= 10 ; 
        }
        Collections.sort(list); 
        int len = list.size(); 
        int ans = list.get(len-1) * list.get(len-2); 
        return ans; 
        
        
    }
}