class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=Integer.MAX_VALUE;
        for(int i : nums){
            if(Math.abs(i) < Math.abs(ans)){
                ans = i;
            }

            if(Math.abs(i) == Math.abs(ans)){
                ans = Math.max(i, ans);
            }
        }
        return ans;
    }
}