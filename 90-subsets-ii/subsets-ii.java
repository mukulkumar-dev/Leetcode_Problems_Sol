class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result=new HashSet<>();
        List<Integer> temp=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,nums,temp,result);
        return new ArrayList<>(result);
    }
    public void backtrack(int index, int[] nums, List<Integer> temp, Set<List<Integer>> result){
        result.add(new ArrayList<>(temp));
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(i+1,nums,temp,result);
            temp.remove(temp.size()-1);
        }
    }
}