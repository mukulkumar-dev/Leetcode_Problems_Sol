class Solution {
    public int[] minCosts(int[] cost) {
        int[] arr = new int[cost.length];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = Math.min(i > 0 ? arr[i - 1] : Integer.MAX_VALUE, cost[i]);
        return arr;
    }
}