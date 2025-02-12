class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int result[] =new int[n-k+1];
        if(n==0){
            return result;
        }
        Deque<Integer> deque=new ArrayDeque<Integer>();
        int index=0;
        while(index<k){
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[index]){
                deque.pollLast();
            }
            deque.offerLast(index);
            index++;
        }
        result[0]=nums[deque.peekFirst()];
        for(int i=1;i<n-k+1;i++){
            if(!deque.isEmpty() && deque.peekFirst()<=(i-1)){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]<=nums[i+k-1]){
                deque.pollLast();
            }
            deque.offerLast(i+k-1);
            result[i]=nums[deque.peekFirst()];
        }
        return result;
    }
}