class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> left=new HashSet<>();
        for(int num:nums){
            if(left.contains(num)){
                left.remove(num);
            }
            else{
                left.add(num);
            }
        }
        return left.size()==0;
    }
}