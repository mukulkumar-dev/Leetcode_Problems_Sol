class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left=0;
        int totalCost=0;
        int maxLength=0;
        for(int i=0;i<s.length();i++){
            int cost=Math.abs(s.charAt(i)-t.charAt(i));
            totalCost+=cost;

            while(totalCost>maxCost){
                totalCost-=Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            maxLength=Math.max(maxLength, i-left+1);
        }
        return maxLength;
    }
}