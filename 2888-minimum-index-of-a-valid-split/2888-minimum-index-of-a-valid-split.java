class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer , Integer>map  = new HashMap<>(); 
        int val = 0 ; 
        int el =  0 ; 
        for( int ele : nums ){
            map.put(ele , map.getOrDefault( ele , 0 )+1); 
            if( map.get(ele) > el){
                val = ele ; 
                el = map.get(ele); 
            }

        }
        int n = nums.size(); 
        int prefix[] = new int[n+1]; 
        prefix[0] = 0 ; 
        for( int i =1 ;i <= n ;i++){
            if( nums.get(i-1) == val ){
                prefix[i] = prefix[i-1]+1 ; 

            }else {
                prefix[i] = prefix[i-1]; 
            }
        }
        int ans = -1 ; 
        for( int i = 0 ; i <  n ;i++){
            int a  = prefix[i+1] - prefix[0] ; 
            int b = prefix[n] - prefix[i]; 
           if( a > ((i+1)/2 ) && b > ((n-i+1)/2 ) ){
            ans = i ; 
            break; 
           }


        }
return ans; 
        
    }
}