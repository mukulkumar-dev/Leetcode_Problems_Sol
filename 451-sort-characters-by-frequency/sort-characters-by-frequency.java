import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hash = new HashMap<>();
        for (char c : s.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> hash.get(b) - hash.get(a));
        pq.addAll(hash.keySet());
        StringBuilder result = new StringBuilder();
        while (!pq.isEmpty()) {
            char current = pq.remove();
            int freq = hash.get(current);
            for (int i = 0; i < freq; i++) {
                result.append(current);
            }
        }
        return result.toString();
    }
}
