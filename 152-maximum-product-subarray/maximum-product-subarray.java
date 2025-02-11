class Solution {
    public int maxProduct(int[] nums) {
        int maxNum=nums[0];
        int minNum=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=maxNum;
                maxNum=minNum;
                minNum=temp;
            }
            maxNum=Math.max(nums[i], maxNum*nums[i]);
            minNum=Math.min(nums[i], minNum*nums[i]);
            ans=Math.max(ans, maxNum);
        }
        return ans;
    }
}