class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                capitalCount++;
            }
        }
        if (capitalCount == 0 || 
            capitalCount == word.length() || 
            (capitalCount == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'))) {
            return true;
        }
        return false;
    }
}