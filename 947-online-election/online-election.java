class TopVotedCandidate {
    private int[] times;
    private int[] leaders;
    public TopVotedCandidate(int[] persons, int[] times) {
        this.times=times;
        this.leaders=new int[persons.length];
        Map<Integer, Integer> vote=new HashMap<>();
        int leader=-1;
        int maxVotes=0;
        for(int i=0;i<persons.length;i++){
            int p=persons[i];
            vote.put(p,vote.getOrDefault(p,0)+1);
            if(vote.get(p)>=maxVotes){
                if(p!=leader){
                    leader=p;
                }
                maxVotes=vote.get(p);
            }
            leaders[i]=leader;
        }
    }
    
    public int q(int t) {
        int left=0;
        int right=times.length-1;
        while(left<right){
            int mid=(left+right+1)/2;
            if(times[mid]<=t){
                left=mid;
            }else{
                right=mid-1;
            }
        }
        return leaders[left];
    }
}

/**
 * Your TopVotedCandidate object will be instantiated and called as such:
 * TopVotedCandidate obj = new TopVotedCandidate(persons, times);
 * int param_1 = obj.q(t);
 */