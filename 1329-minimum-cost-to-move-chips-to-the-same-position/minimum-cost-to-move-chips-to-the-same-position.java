class Solution {
    public int minCostToMoveChips(int[] position) {
        for(int i=0;i<position.length;i++){
            position[i]=position[i]%2;
        }
        int zero=0;
        int one=0;
        for(int i=0;i<position.length;i++){
            if(position[i]==0)
                zero++;
            else
                one++;
        }
        return Math.min(zero,one);
    }
}