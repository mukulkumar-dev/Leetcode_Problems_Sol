class Solution {
    public int minInsertions(String s) {
        int temp = 0, res = 0;
        boolean need = false;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (need) {
                    res++;
                    need = false;
                }
                temp++;
            } else {
                if (need) {
                    need = false;
                } else {
                    if (temp == 0) {
                        temp++;
                        res++;
                    }
                    temp--;
                    need = true;
                }
            }
        }
        if (need)
            res++;
        res += temp * 2;
        return res;
    }
}