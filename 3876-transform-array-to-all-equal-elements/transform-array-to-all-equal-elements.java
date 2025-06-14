class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        boolean result1=solve(nums, k, 1);
        boolean result2=solve(nums, k,-1);
        return result1 || result2;
    }
    public boolean solve(int [] nums,int k, int n){
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) arr[i]=nums[i];
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            if(arr[i]==n){
                arr[i]=nums[i];
            }else{
                arr[i]=nums[i]*-1;
                arr[i+1]=nums[i+1]*-1;
                count++;
            }
        }
        if(count<=k&&arr[arr.length-1]==n)return true;
        return false;
    }
}