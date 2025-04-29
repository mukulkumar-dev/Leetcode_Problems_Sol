class Solution {
    public boolean backspaceCompare(String s, String t) {
        return compare(s).equals(compare(t));
    }

    private String compare(String str){
        Stack<Character> st=new Stack<>();
        for(char ch:str.toCharArray()){
            if(ch!='#'){
                st.push(ch);
            }else if(!st.isEmpty()){
                st.pop();
            }
        }
        StringBuilder s=new StringBuilder();
        for(int num:st){
            s.append(num);
        }
        return s.toString();
    }
}