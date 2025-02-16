class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] result = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1]; 
        backtrack(result, used, n, 0);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int n, int index) {
        if (index == result.length) {
            return true; 
        }

        if (result[index] != 0) {
            return backtrack(result, used, n, index + 1); 
        }
        for (int num = n; num >= 1; num--) {
            if (!used[num]) {
                if (num == 1) {
                    result[index] = num;
                    used[num] = true;
                } else {
                    int nextIndex = index + num;
                    if (nextIndex < result.length && result[nextIndex] == 0) {
                        result[index] = num;
                        result[nextIndex] = num;
                        used[num] = true;
                    } else {
                        continue;
                    }
                }
                if (backtrack(result, used, n, index + 1)) {
                    return true;
                }
                result[index] = 0;
                if (num == 1) {
                    used[num] = false;
                } else {
                    int nextIndex = index + num;
                    result[nextIndex] = 0;
                    used[num] = false;
                }
            }
        }
        return false; 
    }
}