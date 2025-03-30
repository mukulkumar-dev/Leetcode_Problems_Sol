class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp=new HashMap<>();
        for(int n:nums){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq =new PriorityQueue<>((a,b) ->
        Integer.compare(b.getValue(),a.getValue())
        ); 
        for(Map.Entry<Integer, Integer> enter:mp.entrySet()){
            pq.offer(enter);
        }
        int [] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=Objects.requireNonNull(pq.poll().getKey());
        }
        return res;
    }
}