class Solution {
    public int findJudge(int n, int[][] trust) {
        int [] trust1=new int[n+1];
        int [] trust2=new int[n+1];

        for(int i=0;i<trust.length;i++){
            trust1[trust[i][0]]++;
            trust2[trust[i][1]]++;
        }
        int result=-1;
        for(int i=1;i<=n;i++){
            if(trust1[i]==0 && trust2[i]==n-1){
                result=i;
            }
        }
        return result;
    }
}