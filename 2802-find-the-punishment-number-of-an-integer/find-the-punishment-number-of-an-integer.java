class Solution {
    public int punishmentNumber(int n) {
        int punish=0;
        for(int i=1;i<=n;i++){
            int square=i*i;
            if(partition(square,i)){
                punish+=square;
            }
        }
        return punish;
    }
    public boolean partition(int num, int target){
        if(num<target || target<0){
            return false;
        }
        if(num==target){
            return true;
        }
        return (partition(num/10, target-(num%10)) || partition(num/100, target-(num%100)) || partition(num/1000, target-(num%1000)));
    }
}