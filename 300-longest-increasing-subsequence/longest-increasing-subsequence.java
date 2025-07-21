class Solution {
    public int lengthOfLIS(int[] nums) {
    List<Integer> tails = new ArrayList<>();
    for (int x : nums) {
        int i = Collections.binarySearch(tails, x);
        if (i < 0) i = -(i + 1); 
        if (i == tails.size()) {
            tails.add(x);
        } else {
            tails.set(i, x);
        }
    }
    return tails.size(); 
    }
}