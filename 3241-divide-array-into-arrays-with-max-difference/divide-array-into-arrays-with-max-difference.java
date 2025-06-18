class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result=new int[nums.length/3][3];
        int index=0;
        for(int i=0;i<nums.length;i+=3){
            int temp1=nums[i];
            int temp2=nums[i+1];
            int temp3=nums[i+2];

            if(temp3-temp1 > k){
                return new int[0][];
            }
            
            result[index][0]=temp1;
            result[index][1]=temp2;
            result[index][2]=temp3;
            index++;
        }
        return result;
    }
}