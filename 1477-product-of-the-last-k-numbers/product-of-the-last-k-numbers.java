class ProductOfNumbers {
    ArrayList<Integer> list=new ArrayList<>();
    int product=1;

    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        if(num==0){
            list=new ArrayList<>();
            product=1;
            return;
        }
        product=product*num;
        list.add(product);
    }
    
    public int getProduct(int k) {
        if(list.size()<k){
            return 0;
        }
        int ans=list.get(list.size()-1);
        if(list.size()==k){
            return ans;
        }
        return ans/list.get(list.size()-1-k);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */