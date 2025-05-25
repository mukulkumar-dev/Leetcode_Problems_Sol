class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        find(0,0,0,target,num,"",res);
        return res;
    }
    private void find(int idx , long prev, long currValue, int target , String num , String expr , List<String> res){
        if (idx == num.length()) {
            if (currValue == target) {
                res.add(expr);
            }
            return;
        }
        for(int i = idx; i<num.length() ; i++){
            String curr = num.substring(idx , i+1);
            long currNo = Long.parseLong(curr);

            if(curr.length() > 1 && curr.charAt(0) == '0') break;
            
            if(idx == 0) find(i+1 , currNo , currNo , target , num , expr + currNo , res);

            else{
                find(i + 1 , currNo , currValue + currNo , target , num , expr +  "+" + currNo , res);
                find(i + 1 , -currNo , currValue - currNo , target , num , expr + "-" + currNo , res);
                find(i + 1, prev * currNo, currValue - prev + (prev * currNo), target, num, expr + "*" + currNo, res);

            }
        }
    }
}