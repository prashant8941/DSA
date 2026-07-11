class Solution {
    public static boolean bfs(
            List<List<Integer>> adj,
            boolean[] visited,
            int node
    ) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> component = new ArrayList<>();

        q.add(node);
        visited[node] = true;

        // Traverse the complete connected component
        while (!q.isEmpty()) {
            int nd = q.poll();
            component.add(nd);

            for (int ele : adj.get(nd)) {
                if (!visited[ele]) {
                    visited[ele] = true;
                    q.add(ele);
                }
            }
        }

        int componentSize = component.size();

        // Every node must be connected to all other nodes
        for (int nd : component) {
            if (adj.get(nd).size() != componentSize - 1) {
                return false;
            }
        }

        return true;
    }
    public int countCompleteComponents(int n, int[][] edges) {
        boolean visited[] = new boolean[n]; 
        List<List<Integer>>adj = new ArrayList<>(); 
        for( int i = 0 ;i < n; i++){
            adj.add(new ArrayList<>()); 
        }
        int n2  = edges.length ; 
        for( int i = 0 ;i < n2 ; i++){
            int l = edges[i][0]; 
            int r = edges[i][1]; 
            adj.get(l).add(r); 
            adj.get(r).add(l); 
        }

        int count = 0  ; 
        for( int i = 0 ;i < n;i++){
            if( visited[i]== false ){
                if(bfs(adj , visited , i )){
                    count++ ; 
                } 
            }
        }
        return count ; 

        
    }
}