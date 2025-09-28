class Solution {
    public int convertTime(String current, String correct) {
        String[] curr=current.split(":");
        String[] corr=correct.split(":");
        int currTime=0;
        int corrTime=0;
        for(int i=0;i<curr.length;i++){
            if(i==0){
                int val=Integer.parseInt(curr[i]);
                currTime+=val*60;
            }else{
                currTime+=Integer.parseInt(curr[i]);
            }
        }
        for(int i=0;i<corr.length;i++){
            if(i==0){
                int val=Integer.parseInt(corr[i]);
                corrTime=val*60;
            }else{
                corrTime+=Integer.parseInt(corr[i]);
            }
        }
        int diff = corrTime-currTime;
        int count=0;
        System.out.println(diff);
        while(diff>0){
            if(diff>=60){
                diff-=60;
                count++;
            }
            else if(diff>=15){
                diff-=15;
                count++;
            }
            else if(diff>=5){
                diff-=5;
                count++;
            }
            else{
                diff-=1;
                count++;
            }
        }
        return count;
    }
}