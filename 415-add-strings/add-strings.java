class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder result=new StringBuilder();
        while(i>=0 || j>=0 || carry!=0){
            int value1=i>=0 ? num1.charAt(i)-'0':0;
            int value2=j>=0 ? num2.charAt(j)-'0':0;

            int total=value1+value2+carry;
            carry=total/10;

            result.append(total%10);
            i--;
            j--;
        }
        return result.reverse().toString();
        
    }
}