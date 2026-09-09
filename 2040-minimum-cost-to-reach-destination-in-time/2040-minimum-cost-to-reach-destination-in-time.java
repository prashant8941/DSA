class Solution {
    class Pair{
        int node ; 
        int wt ; 
        Pair( int node , int wt   ){
            this.node = node ; 
            this.wt  =wt; 
        }
    }
    class Pr{
        int node ; 
        int time ; 
        int fees ; 
        Pr(int node , int time , int fees){
            this.node = node ; 
            this.time = time ; 
            this.fees = fees ; 
        }
    }
    public  int find( List<List<Pair>>adj , int[]fees , int maxTime){
        int n = fees.length ;
        int[][]dp  = new int[n][maxTime+1];
        for( int i = 0 ;i < n ;i++){
            Arrays.fill(dp[i] , (int)1e9);
        }
        PriorityQueue<Pr>pq = new PriorityQueue<>(
            (a , b)->Integer.compare(a.fees , b.fees)
        ); 
        pq.add(new Pr(0 , 0 , fees[0])); 
        while( !pq.isEmpty()){
            Pr p = pq.poll(); 
            int nod = p.node ; 
            int tim = p.time ; 
            int fee = p.fees; 
            if( fee> dp[nod][tim])continue ; 
            if( tim>maxTime)continue ; 
            if( nod == n-1){
                return fee ;  
            }
            for( Pair ele : adj.get(nod)){
                int cost = fee+fees[ele.node];
                if( tim+ele.wt > maxTime)continue;  
                if( cost < dp[ele.node][tim+ele.wt] ){
                    dp[ele.node][tim+ele.wt] = cost ; 
                pq.add(new Pr(ele.node, tim+ele.wt , fee+fees[ele.node]));
                }
            
            }
           


        }
        return -1 ; 

    }
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int n = passingFees.length ; 
        List<List<Pair>>adj = new ArrayList<>(); 
        for( int i = 0 ;i <= n ;i++){
            adj.add(new ArrayList<>()); 
        }
        for( int i = 0 ;i < edges.length ; i++){
            int u = edges[i][0]; 
            int v = edges[i][1]; 
            int wt = edges[i][2]; 
            adj.get(u).add(new Pair(v ,wt )); 
            adj.get(v).add(new Pair(u, wt)); 
        }
        return find( adj , passingFees , maxTime); 
        

        
    }
}