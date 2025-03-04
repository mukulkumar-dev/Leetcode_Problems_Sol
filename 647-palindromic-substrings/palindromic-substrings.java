class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int result=0;
        for(int i=0;i<n;i++){
            int even=palindrome(s,i,i+1);
            int odd=palindrome(s,i-1,i+1);
            result+=even+odd+1;
        }
        return result;
    }
    public int palindrome(String s, int left, int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left--) == s.charAt(right++)){
            count++;
        }
        return count;
    }
}