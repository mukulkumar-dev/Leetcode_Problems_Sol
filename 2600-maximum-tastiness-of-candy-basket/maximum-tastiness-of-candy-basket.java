class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int maxGap = price[price.length - 1] - price[0];
        int minGap = 0; 
        int ans = 0;
        while(minGap<= maxGap){
            int midGap = minGap + (maxGap - minGap) / 2;  
            if(help(price , midGap , k)){ 
                ans = midGap; 
                minGap = midGap + 1;
            }else {
                maxGap = midGap - 1;
            }

        }
        return ans;
    }
    boolean help(int[] price , int gapPrice , int k ){ 
        int count = 1; 
        int lastMin = price[0];

        for(int i = 1 ; i < price.length ; i++){
            if(price[i] - lastMin >= gapPrice){ 
                count++;
                lastMin = price[i];
            }
        }
        return count >= k; 
    }
}