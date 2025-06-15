class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(solve(i))    result.add(i);
        }
        return result;
    }
    public boolean solve(int num){
        int temp=num;
        while(num!=0){
            int rem=num%10;
            if(rem==0){
                return false;
            }
            if(temp%rem!=0){
                return false;
            }
            num/=10;
        }
        return true;
    }
}