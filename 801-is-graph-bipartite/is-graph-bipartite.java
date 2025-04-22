class Solution {
    public boolean isBipartite(int[][] graph) {
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<color.length;i++){
            if(color[i]==-1){
                if(!bfs(graph, color, i)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int[][] graph, int visit[] , int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        visit[start]=1;
        while(!q.isEmpty()){
            int node=q.remove();
            for(int n:graph[node]){
                if(visit[n]==-1){
                    if(visit[node]==0){
                        visit[n]=1;
                    }else{
                        visit[n]=0;
                    }
                    q.add(n);
                }else if(visit[n]!=-1 && visit[n]== visit[node]){
                    return false;
                }
            }
        }
        return true;
    }
}