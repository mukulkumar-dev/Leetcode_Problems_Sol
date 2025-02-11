class Solution {
    public int maxSubArray(int[] nums) {
        int result=nums[0];
        int maxNum=nums[0];
        for(int i=1;i<nums.length;i++){
            maxNum=Math.max((maxNum+nums[i]),nums[i]);
            result=Math.max(result,maxNum);
        }
        return result;
    }
}