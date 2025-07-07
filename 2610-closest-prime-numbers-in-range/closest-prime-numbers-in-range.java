class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] prime=new boolean[right+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=right;i++){
            if(prime[i]){
                for(int j=i*i;j<=right;j+=i){
                    prime[j]=false;
                }
            }
        }
         List<Integer> resultL = new ArrayList<>();
        for (int i=Math.max(2, left);i<=right;i++) {
            if (prime[i]) {
                resultL.add(i);
            }
        }
        int minDiff = Integer.MAX_VALUE;
        int[] result = { -1, -1 };
        for (int i = 1; i < resultL.size(); i++) {
            int diff = resultL.get(i) - resultL.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                result[0] = resultL.get(i - 1);
                result[1] = resultL.get(i);
            }
        }
        return result;
    }
}