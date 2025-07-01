class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> hp=new HashMap<>();
        int maxFreq=0;
        int result=-1;

        for(int num:nums){
            if(num%2==0){
                hp.put(num, hp.getOrDefault(num,0)+1);
                int freq=hp.get(num);
                if(freq>maxFreq || (freq==maxFreq && num<result)){
                    maxFreq = freq;
                    result = num;
                }
            }
        }
        return result;
    }
}