public class Solution {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new boolean[nums.length], new ArrayList<>(), result);
        return result;
    }
    private static void backtrack(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp)); // Found one permutation
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // Skip already used numbers

            // Choose
            temp.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, used, temp, result);

            // Un-choose (backtrack)
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> output = permute(nums);
        System.out.println("Permutations:");
        for (List<Integer> perm : output) {
            System.out.println(perm);
        }
    }
}
