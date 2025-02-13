class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq=new PriorityQueue<>();
        for(long num:nums){
            pq.add(num);
        }
        int count=0;
        while(pq.peek()<k){
            long ans=pq.poll()*2 + pq.poll();
            pq.add(ans);
            count++;
        }
        return count;
    }
}