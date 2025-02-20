class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                int j=i;
                while(i>=0){
                    str.append(word.charAt(i));
                    i--;
                }
                str.append(word.substring(j+1));
                return str.toString();
            }
        }
        return word;
    }
}