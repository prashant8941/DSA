class Solution {
    class Pair{
        int node ;  
        int dist; 
        Pair( int node , int dist){
            this.node = node ; 
            this.dist = dist ; 
        }
    }
    public int minScore(int n, int[][] roads) {
        List<List<Pair>>adj =new ArrayList<>(); 
        for( int i = 0 ;i <= n ;i++){
            adj.add(new ArrayList<>()); 
        }
        for( int i = 0 ;i < roads.length ; i++){
            int u  = roads[i][0]; 
            int v = roads[i][1]; 
            int dist = roads[i][2]; 
            adj.get(u).add(new Pair( v , dist)); 
            adj.get(v).add(new Pair( u , dist)); 
        }
        boolean[]visited = new boolean[n+1]; 
        Queue<Pair>q = new LinkedList<>(); 
        q.add(new Pair(1 , (int)1e9 )); 
        visited[1] = true ;
        int min = (int)1e9 ;
        boolean cond = false ; 
        while( !q.isEmpty()){
            Pair p = q.poll(); 
            int nd = p.node ; 
            if( nd == n){
                cond = true ; 
            }
            visited[nd]  = true ; 
            int dis = p.dist ; 
            min = Math.min(min , dis); 
            for( Pair nodee : adj.get(nd)){
                if( !visited[nodee.node]){
                    q.add(new Pair( nodee.node ,  nodee.dist)); 
                    // visited[nodee.node] = true ; 

                }

            }


        }
        if( cond ){
            return min ; 
        }
        return -1  ; 

        
    }
}