class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(0,nums,curr,result);
        return result;
    }
    public void backtrack(int index,int[] arr,List<Integer> curr,List<List<Integer>> result){
        result.add(new ArrayList<>(curr));
        for(int i=index;i<arr.length;i++){
            curr.add(arr[i]);
            backtrack(i+1,arr,curr,result);
            curr.remove(curr.size()-1);

        }
    }
}