class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> n =new  HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(n.containsKey(nums[i])){
                if(Math.abs(n.get(nums[i])-i)<=k)
                    return true;
            }
            n.put(nums[i],i);
        }
        return false;
    }
}