class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int right=0;
        int currSum=0;
        int xorSum=0;
        int maxSize=0;
        while(right<nums.length){
            currSum+=nums[right];
            xorSum^=nums[right];
            while(xorSum!=currSum){
                currSum-=nums[left];
                xorSum^=nums[left];
                left++;
            }
            maxSize=Math.max(maxSize,right-left+1);
            right++;
        }
        return maxSize;
    }
}