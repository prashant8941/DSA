class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<List<Integer>>adj = new ArrayList<>(); 
        for( int i = 0 ;i < n ;i++){
            adj.add(new ArrayList<>()); 
        }
        int nn = invocations.length ; 
        for( int i = 0 ;i < nn; i++){
            int u = invocations[i][0]; 
            int v= invocations[i][1]; 
            adj.get(u).add(v); 
        }
        boolean[]suspecius = new boolean[n]; 
        boolean[]visited = new boolean[n]; 
        Queue<Integer>q = new LinkedList<>(); 
        q.add(k); 
        while(!q.isEmpty()){
            int node  = q.poll(); 
            suspecius[node] = true ; 
            visited[node] = true ; 
            for( int ele : adj.get(node)){
                if( !visited[ele]){
                    q.add(ele); 
                }
            }
        }

        boolean []outside = new boolean[n]; 
        for( int i = 0 ;  i < n ;i++){
            if( suspecius[i] == false ){
                for( int ele : adj.get(i)){
                    outside[ele] = true ; 
                    
                }
            }
        }
        int ct = 0 ; 
        for( int i = 0 ;i < n; i++){
            if(suspecius[i] == true){
                ct++ ; 
            }
        }
       int fct = 0 ; 
        for( int i = 0 ;i < n; i++){
            if( suspecius[i] == true  && outside[i] == true ){
                fct++ ; 
            }
        }
        List<Integer>ans = new ArrayList<>(); 
        if(  fct == 0  ){
            for(int i = 0 ;i < n ;i++){
                if( suspecius[i] == false ){
                    ans.add(i); 
                }
            }

        }else{
            for(int i = 0 ;i < n; i++){
                ans.add(i); 
            }
        }
        return ans; 


        
    }
}