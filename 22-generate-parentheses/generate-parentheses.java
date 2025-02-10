class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        traverse(0,0, "", n, result);
        return result;
    }

    private void traverse(int open, int close, String str, int num, List<String> result){
        if(open == close && open+close == num*2){
            result.add(str);
            return;
        }
        if(open<num)
            traverse(open+1, close, str +"(", num, result);
        if(close<open)
            traverse(open, close+1, str +")", num, result);
    }
}