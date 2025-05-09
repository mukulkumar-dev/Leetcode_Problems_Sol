class Solution{
    public int countDigitOne(int n) {
    if (n <= 0) 
        return 0;
    int q = n;
    int x = 1;
    int ans = 0;
    do {
        int digit = q % 10;
        q /= 10;
        ans += q * x;
        if (digit == 1){
            ans += n % x + 1;
        }
        if (digit >  1){
            ans += x;
        }
        x *= 10;
    } while (q > 0);
    return ans;
    }
}