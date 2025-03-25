class Solution {
    public boolean isThree(int n) {
        int sqrt=0;
        for(int i=1;i*i<=n;i++){
            if(i*i==n){
                sqrt=i;
                break;
            }
        }
        if(sqrt==0){
            return false;
        }
        int count=0;
        for(int i=1;i<=sqrt;i++){
            if(sqrt%i==0){
                count++;
            }
        }
        return (count==2);
    }
}