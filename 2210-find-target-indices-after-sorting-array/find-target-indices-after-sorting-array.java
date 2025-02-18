class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        int last=0;
        int count=0;
        for(int i:nums){
            if(i==target) count++;
            if(i<target) last++;
        }
        for(int i=0;i<count;i++){
            ans.add(last++);
        }
        return ans;
    }
}