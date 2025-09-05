class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long total = 0;
        int negCount = 0;
        int minAbs = Integer.MAX_VALUE;

        for (int[] row : matrix) {
            for (int val : row) {
                total += Math.abs(val);
                if (val < 0) negCount++;
                minAbs = Math.min(minAbs, Math.abs(val));
            }
        }

        if (negCount % 2 == 0) return total;
        else return total - 2L * minAbs;
    }
}