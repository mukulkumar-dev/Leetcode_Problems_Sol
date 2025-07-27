class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  
        boolean[] visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<>(), visited, result);
        return result;
    }
    private void backtrack(int[] nums, List<Integer> temp, boolean[] visited, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) continue;

            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) continue;
            temp.add(nums[i]);
            visited[i] = true;
            backtrack(nums, temp, visited, result);
            visited[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}