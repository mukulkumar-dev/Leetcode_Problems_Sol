class Solution {
    public int possibleStringCount(String word) {
         int n = word.length();
        int total = 1; 
        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            int groupLength = j - i;
            if (groupLength > 1) {
                total += (groupLength - 1);
            }
            i = j; 
        }
        return total;
    }
}