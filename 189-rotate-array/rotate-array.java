class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=nums.length;
        swap(nums, 0, n-1);
        swap(nums, 0, k-1);
        swap(nums, k, n-1);
    }
    public static void swap(int [] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }   
    }
}