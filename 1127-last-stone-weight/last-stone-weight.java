class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            pq.add(num);
        }
        while(pq.size()>1){
            int max1=pq.poll();
            int max2=pq.poll();
            if(max1 != max2){
                pq.add(max1-max2);
            }
        }
        if(pq.size()==0)return 0;
        return pq.poll();
    }
}