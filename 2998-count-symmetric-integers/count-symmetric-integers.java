class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            String str=Integer.toString(num);
            int len=str.length();
            if(len%2!=0)
                continue;
            int parition=len/2;
            int leftSide=0;
            int rightSide=0;
            for(int i=0;i<parition;i++){
                leftSide+=str.charAt(i)-'0';
            }
            for(int i=parition;i<len;i++){
                rightSide+=str.charAt(i)-'0';
            }
            if(leftSide==rightSide){
                count++;
            }
        }
        return count;
    } 
}