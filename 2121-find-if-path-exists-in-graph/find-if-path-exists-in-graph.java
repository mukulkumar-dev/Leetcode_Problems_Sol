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
        return dfs(list, visit, source, destination);
       
    }
    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int current, int destination) {
        if (current == destination) return true;
        visited[current] = true;
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(graph, visited, neighbor, destination)) {
                    return true;
                }
            }
        }
        return false;
    }
}