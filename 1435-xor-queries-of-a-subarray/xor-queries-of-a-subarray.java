class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            int xor=0;
            for(int j=left;j<=right;j++){
                xor^=arr[j];
            }
            result[i]=xor;
        }
        return result;
    }
}