class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> s=new HashSet<>();
        for(int num:candyType){
            s.add(num);
        }
        int n=candyType.length/2;
        if(s.size()>=n){
            return n;
        }
        else{
            return s.size();
        }
    }
}