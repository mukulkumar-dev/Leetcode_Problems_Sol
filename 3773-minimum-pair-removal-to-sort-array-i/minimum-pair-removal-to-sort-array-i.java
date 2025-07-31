class Solution {
    public int minimumPairRemoval(int[] nums) {
        int length = nums.length;
        int count = 0;
        while (length > 1) {
            boolean nonDecreasing = true;
            int maxSum = Integer.MAX_VALUE;
            int maxIndex = -1;
            for (int i = 0; i < length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    nonDecreasing = false;
                }
                if (nums[i] + nums[i + 1] < maxSum) {
                    maxSum = nums[i] + nums[i + 1];
                    maxIndex = i;
                }
            }
            if (nonDecreasing) {
                break;
            }
            nums[maxIndex] = maxSum;
            for (int i = maxIndex + 1; i < length - 1; i++) {
                nums[i] = nums[i + 1];
            }
            length--;
            count++;
        }
        return count;
    }
}