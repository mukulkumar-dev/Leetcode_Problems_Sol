class Solution {
    public int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isGoodNumber(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isGoodNumber(int num) {
        boolean hasChangedDigit = false;

        while (num > 0) {
            int digit = num % 10;

            if (digit == 3 || digit == 4 || digit == 7) {
                return false; // invalid digit
            }

            if (digit == 2 || digit == 5 || digit == 6 || digit == 9) {
                hasChangedDigit = true; 
            }

            num /= 10;
        }
        return hasChangedDigit;
    }
}