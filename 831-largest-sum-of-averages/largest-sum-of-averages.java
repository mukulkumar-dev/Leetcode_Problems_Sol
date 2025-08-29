class Solution {
    public double largestSumOfAverages(int[] nums, int k) {
        return helper(nums,k,0,new Double[nums.length][k+1]);
    } 
    private double helper(int[] nums, int k, int index, Double[][] memo) {
        if(index == nums.length)
            return 0;
        if(memo[index][k] != null)
            return memo[index][k];
        int sum=0;
        if(k == 1) {
            for(int i=index; i<nums.length; i++) {
                sum += nums[i];
            }
            return memo[index][k] = sum*1.0/(nums.length-index);
        }
        int count=0;
        double max=0;
        double currAvg=0;
        for(int i=index; i<nums.length; i++) {
            sum += nums[i];
            count++;
            currAvg=sum*1.0/count;
            max=Math.max(max,currAvg+helper(nums,k-1,i+1,memo));
        }
        return memo[index][k] = max;
    }
}