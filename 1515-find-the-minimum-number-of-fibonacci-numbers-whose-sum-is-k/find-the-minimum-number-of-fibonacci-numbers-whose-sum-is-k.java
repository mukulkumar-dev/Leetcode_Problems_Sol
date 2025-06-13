class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(1);
        int c=2;
        while(c<=k){
            arr.add(c);
            int n=arr.size();
            c=arr.get(n-1)+arr.get(n-2);
        }
        int count=0;
        for(int i=arr.size()-1;i>=0 && k>0; i--){
            if(arr.get(i)<=k){
                k-=arr.get(i);
                count++;
            }
        }
        return count;
    }
}