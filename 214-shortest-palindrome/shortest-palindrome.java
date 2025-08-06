class Solution {
    public String shortestPalindrome(String s) {
        int count=solve(new StringBuilder(s).reverse().toString(),s);
        return new StringBuilder(s.substring(count)).reverse().toString()+s;
    }
    public int solve(String text, String pattern){
        String newStr=pattern+"#"+text;
        int[] arr=new int[newStr.length()];
        int i=1;
        int k=0;
        while(i<newStr.length()){
            if(newStr.charAt(i)==newStr.charAt(k)){
                k++;
                arr[i]=k;
                i++;
            }else{
                if(k>0) k=arr[k-1];
                else{
                    arr[i]=0;
                    i++;
                }
            }
        }
        return arr[newStr.length()-1];
    }
}