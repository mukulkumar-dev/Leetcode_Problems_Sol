class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        if (n <= 2) {
            return s.charAt(0) == s.charAt(1);
        }
        int pascal = n - 1;
        int diff = (Character.getNumericValue(s.charAt(0)) - Character.getNumericValue(s.charAt(n - 1))) % 10;
        int rem = 1, count2 = 0, count5 = 0;
        int[] inverse = {0, 1, 0, 7, 0, 0, 0, 3, 0, 9};
        for (int i = 1; i < pascal; i += 1) {
            int num = pascal - i;
            int den = i;
            int[] numResult = factorize(num);
            int[] denResult = factorize(den);
            rem = (rem * numResult[0] * inverse[denResult[0]]) % 10;
            count2 = count2 + numResult[1] - denResult[1];
            count5 = count5 + numResult[2] - denResult[2];
            int c;
            if (count2 > 0 && count5 > 0) {
                c = 0;
            } else if (count2 > 0) {
                int[] power = {6, 2, 4, 8};
                int twoMod = power[count2 % 4];
                if(count2 % 4 == 0) twoMod = 6;
                c = (rem * twoMod) % 10;
            } else if (count5 > 0) {
                c = (rem * 5) % 10;
            } else {
                c = rem;
            }
            diff = (diff + (Character.getNumericValue(s.charAt(i)) - Character.getNumericValue(s.charAt(n - 1 - i))) * c) % 10;
        }
        return diff % 10 == 0;
    }
    private int[] factorize(int x) {
        int count2 = 0, count5 = 0;
        while (x % 2 == 0) {
            count2 += 1;
            x /= 2;
        }
        while (x % 5 == 0) {
            count5 += 1;
            x /= 5;
        }
        return new int[]{x % 10, count2, count5};
    }
}