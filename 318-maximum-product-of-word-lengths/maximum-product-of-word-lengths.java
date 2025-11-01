class Solution {
    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        int[] lens = new int[n];
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) mask |= 1 << (c - 'a');    
            masks[i] = mask;
            lens[i] = words[i].length();
        }
        int best = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    best = Math.max(best, lens[i] * lens[j]);
                }
            }
        }
        return best;
    }
}