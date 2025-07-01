class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hp=new HashMap<>();
        for(int i:nums){
            hp.put(i,hp.getOrDefault(i,0)+1);
        }
        List<Integer>[] list=new List[nums.length+1];
        for(int i=0;i<=nums.length;i++){
            list[i]=new ArrayList<>();
        }
        for(int i:hp.keySet()){
            int freq=hp.get(i);
            list[freq].add(i);
        }
        List<Integer> result=new ArrayList<>();
        for(int i=list.length-1;i>=0 && result.size()<k ; i--){
            for(int num:list[i]){
                result.add(num);
                if(result.size()==k){
                    break;
                }
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=result.get(i);
        }
        return ans;
    }
}