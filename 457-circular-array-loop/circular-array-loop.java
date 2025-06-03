class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int length = nums.length;
        for (int start = 0; start < length; ++start) {
            Set<Integer> checked = new HashSet<>();  
            int cur = start, count = 0, sign = nums[start] > 0 ? 1 : -1;
            while (!checked.contains(cur) && nums[cur] * sign > 0) {
                checked.add(cur);
                cur = ((cur + nums[cur]) % length + length) % length;
                ++count;
                if (cur == start && count > 1) return true;
            }
        }
        return false;
    }
}