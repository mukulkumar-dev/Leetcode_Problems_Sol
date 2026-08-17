class Solution {
    public char repeatedCharacter(String s) {
        boolean[] twice=new boolean[26];
        for(char ch:s.toCharArray()){
            int index=ch-'a';
            if(twice[index]){
                return ch;
            }
            twice[index]=true;
        }
        return ' ';
    }
}