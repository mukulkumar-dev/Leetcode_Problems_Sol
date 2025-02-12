class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj1=0;
        int maj2=0;
        int count1=0;
        int count2=0;

        for(int num:nums){
            if(num==maj1){
                count1++;
            }else if(num==maj2){
                count2++;
            }else if(count1==0){
                maj1=num;
                count1++;
            }else if(count2==0){
                maj2=num;
                count2++;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num:nums){
            if(num==maj1){
                count1++;
            }else if(num==maj2){
                count2++;
            }
        }
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        if(count1>n/3){
            res.add(maj1);
        }
        if(count2>n/3){
            res.add(maj2);
        }
        return res;
    }
}