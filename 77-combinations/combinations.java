class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        int[] curr=new int[k];
        dfs(1,0,n,k,curr,result);
        return result;
    }
    private void dfs(int start, int depth,int n,int k,int[]curr,List<List<Integer>> result){
        if(depth==k){
            List<Integer>comb=new ArrayList<>();
            for(int num:curr){
                comb.add(num);
            }
            result.add(comb);
            return;
        }
        for(int i=start;i<=n-(k-depth)+1;i++){
            curr[depth]=i;
            dfs(i+1,depth+1,n,k,curr,result);
        }
    }
}