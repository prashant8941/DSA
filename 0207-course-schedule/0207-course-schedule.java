class Solution {
    public boolean canFinish(int numC, int[][] pr) {
        int n = pr.length ; 
        List<List<Integer>>adj = new ArrayList<>(); 
        for( int i = 0 ;i < numC; i++){
            adj.add(new ArrayList<>()); 

        }
        for( int i = 0 ;i < pr.length ; i++){
            int u = pr[i][0]; 
            int v = pr[i][1]; 
            adj.get(u).add(v); 
        }
        int[]indegree = new int[numC]; 
        for( int i = 0 ;i < numC ;i++){
            for( int ele : adj.get(i)){
                indegree[ele]++ ; 
            }
        }
        Queue<Integer>q = new LinkedList<>(); 
        for( int i = 0 ;i < numC ;i++){
            if( indegree[i] == 0 ){
                q.add(i); 
            }

        }
        int count = 0 ; 
        while(!q.isEmpty()){
            count++ ; 
            int node = q.poll(); 
            for( int ele :adj.get(node)){
                indegree[ele]-- ; 
                if( indegree[ele] == 0 ){
                    q.add(ele); 
                }
            }
        }
        return count==numC ; 

        
    }
}