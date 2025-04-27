class Solution {
    public int[] sortByBits(int[] arr) {
        Map<Integer, Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int count=0;
            int num=arr[i];
            while(num>0){
                int rem=num%2;
                if(rem==1) count++;
                num/=2;
            }
            mp.put(arr[i], count);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:arr){
            list.add(num);
        }
        list.sort((a,b)->{
            int compare= mp.get(a).compareTo(mp.get(b));
            if(compare==0){
                return a.compareTo(b);
            }
            else{
                return compare;
            }
        });
        int [] result= new int[list.size()];
        for(int i=0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
}