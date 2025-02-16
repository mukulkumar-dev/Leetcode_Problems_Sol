class Solution {
    public boolean windowSize(int size, int[] nums, int target) {
        int sum=0;
        int i=0;
        int j=0;
        int maxSum=Integer.MIN_VALUE;
        while(j<nums.length){
            sum+=nums[j];
            if(j-i+1 == size){
                maxSum=Math.max(sum,maxSum);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        if(maxSum>=target){
            return true;
        }
        return false;
    }
    public int minSubArrayLen(int target, int[] nums){
        int low=1;
        int high=nums.length;
        int max=0;
        while(low<=high){
            int mid= (low+high)/2;
            if(windowSize(mid, nums, target)){
                high=mid-1;
                max=mid;
            }else{
                low=mid+1;
            }
        }
        return max;
    }
}