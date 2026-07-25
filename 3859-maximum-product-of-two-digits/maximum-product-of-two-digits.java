class Solution {
    public int maxProduct(int n) {
        if(n<=9)return n;
        int max=0;
        int sumMax=0;
        while(n>0){
            int currMax=n%10;
            if(currMax>max){
                sumMax=max;
                max=currMax;
            }else if(currMax>sumMax){
                sumMax=currMax;
            }
            n/=10;
        }
        return sumMax*max;
    }
}