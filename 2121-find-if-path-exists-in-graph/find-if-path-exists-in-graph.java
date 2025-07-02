class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int[] num:edges){
            list.get(num[0]).add(num[1]);
            list.get(num[1]).add(num[0]);
        }
        boolean[] visit=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.offer(source);
        visit[source]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            if(curr==destination) return true;
            for(int neighbour: list.get(curr)){
                if(!visit[neighbour]){
                    visit[neighbour]=true;
                    q.offer(neighbour);
                }
            }
        }
        return false;
    }
}