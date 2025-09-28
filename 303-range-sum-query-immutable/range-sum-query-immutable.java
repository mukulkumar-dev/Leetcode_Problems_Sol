class NumArray {

    public int[] sumArray;
    public int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.sumArray = new int[nums.length];
        sumArray[0] = nums[0];
        for (int i=1; i<nums.length; i++) {
            sumArray[i] = sumArray[i-1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return sumArray[right] - sumArray[left] + nums[left];
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */