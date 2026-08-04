class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[]indegree = new int[numCourses]; 
        List<List<Integer>>adj = new ArrayList<>(); 
        for( int i = 0 ;i < numCourses ; i++){
            adj.add( new ArrayList<>()); 
        }
        int n = prerequisites.length; 
        for( int i = 0 ;i < n; i++){
            int a = prerequisites[i][0]; 
            int b = prerequisites[i][1]; 
            adj.get(a).add(b); 
        }
        for( int i = 0 ;i < numCourses ; i++){
            for( int ele : adj.get(i)){
                indegree[ele]++ ; 
            }
        }
        Queue<Integer>q = new LinkedList<>(); 
        for( int i = 0 ;i < numCourses ; i++){
            if( indegree[i] == 0 ){
                q.add(i); 

            }
        }
        int count = 0 ; 
        while(!q.isEmpty()){
            count++ ; 
            int node = q.poll(); 
            for(int ele :adj.get(node) ){
                indegree[ele]-- ; 
                if( indegree[ele] == 0 ){
                    q.add(ele); 
                }
            }
        }
        return count == numCourses ; 
        
    }
}