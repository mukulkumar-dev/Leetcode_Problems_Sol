class Solution {
    public char kthCharacter(int k) {
        char ch = 'a';
        while (k > 1) {
            int length = 1;
            while (length * 2 < k) {
                length *= 2;
            }
            if (k > length) {
                k -= length;
                ch = shift(ch);
            }
        }
        return ch;
    }
    private static char shift(char ch) {
        return (ch == 'z') ? 'a' : (char)(ch + 1);
    }
}