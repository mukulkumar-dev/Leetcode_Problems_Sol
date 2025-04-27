class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> hash=new HashMap<>();
        for(int num:nums){
            hash.put(num, hash.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        list.sort((a,b)->{
            int compare= hash.get(a).compareTo(hash.get(b));
            if(compare==0){
                return b.compareTo(a);
            }
            else{
                return compare;
            }
        });
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }
}