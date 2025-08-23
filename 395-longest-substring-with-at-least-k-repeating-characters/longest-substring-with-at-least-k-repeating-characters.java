class Solution {
    public int longestSubstring(String s, int k) {
         if (s == null || s.length() == 0) return 0;
        return solve(s, k);
    }
    public int solve(String s, int k){
        if(s.length()<k) return 0;
        Map<Character, Integer> map=new HashMap<>();
        for(char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) < k) {
                int max = 0;
                for (String part : s.split(Character.toString(ch))) {
                    max = Math.max(max, solve(part, k));
                }
                return max;
            }
        }
        return s.length();
    }
}