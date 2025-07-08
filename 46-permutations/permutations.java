class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }
    public void backtrack(int[] nums, int start, List<List<Integer>> res){
        if(start == nums.length){
            List<Integer> perm = new ArrayList<>();
            for(int val : nums) perm.add(val);
            res.add(perm);
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, i, start);
            backtrack(nums, start+1, res);
            swap(nums, i, start);
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}