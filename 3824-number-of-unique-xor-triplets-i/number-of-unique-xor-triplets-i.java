class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<=2){
            return n;
        }
        int value=0;
        for(int num:nums){
            value|=num;
        }
        return value+1;
    }
}