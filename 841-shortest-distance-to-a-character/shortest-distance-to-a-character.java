class Solution {
    public int[] shortestToChar(String s, char c) {
        int left=0;
        int right=0;
        int n= s.length();
        int []arr=new int[n];
        int shortest=Integer.MAX_VALUE-1;
        while(left<n && right<n){
            if(s.charAt(right)==c){
                while(left<=right){
                    shortest=Math.min(shortest+1, (right-left));
                    arr[left]=shortest;
                    left++;
                }
            }
            right++;
        }
        while(left<n){
        shortest++;
        arr[left]=shortest;
        left++;
        }
        return arr;
    }
}