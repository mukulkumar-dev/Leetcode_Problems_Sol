class Solution {
    public int maximumLength(String s) {
        int low=1;
        int right=s.length();
        if(!search(s,s.length(),low)){
            return -1;
        }
        while(low+1<right){
            int mid=(low+right)/2;
            if(search(s,s.length(),mid)){
                low=mid;
            }
            else{
                right=mid;
            }
        }
        return low;
    }
    private boolean search(String s, int x, int y){
        int[]temp=new int[26];
        int count=0;
        for(int i=0;i<x;i++){
            while(s.charAt(count) != s.charAt(i)){
                count++;
            }
            if(i-count+1>=y){
                temp[s.charAt(i)-'a']++;
            }
            if(temp[s.charAt(i)-'a']>2){
                return true;
            }
        }
        return false;
    }
}