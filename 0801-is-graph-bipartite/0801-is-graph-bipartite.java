class Solution {
class Pair{
    int node ; 
    int color ; 
    Pair( int node , int color ){
        this.node = node ; 
        this.color = color ; 
    }
}
    public boolean isBipartite(int[][] graph) {
        //  making  the adjancy list 
        int nodes = graph.length ; 
        List<List<Integer>>adj = new ArrayList<>(); 
        for( int i = 0 ;  i < graph.length ; i++){
            List<Integer>ss = new ArrayList<>(); 
            for( int j = 0 ; j < graph[i].length ; j++){
                ss.add(graph[i][j]); 
            }
            adj.add(ss); 
        }
        int color[] = new int[nodes]; 
        for( int i = 0 ; i< color.length ; i++){
            color[i] = -1 ; 
        }
        for(  int i = 0 ; i < color.length ; i++){
            if( color[i] == -1){
                Queue<Pair>q = new LinkedList<>(); 
                q.add(new Pair( i , 0 )); 
                while(!q.isEmpty()){
                    Pair p   = q.poll(); 
                    int node = p.node  ; 
                    int col =  p.color ; 

                    for( int ele : adj.get(node)){
                        if( color[ele] == -1 ){
                            color[ele] = 1-col ; 
                            q.add(new Pair( ele , 1-col)); 
                        }else if( color[ele] == col){
                            return false ; 
                        }
                    }
                }

            }
        }

return true ; 
        
    }
}