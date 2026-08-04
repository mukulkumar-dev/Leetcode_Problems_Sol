class Solution {
    public List<Integer> splitIntoFibonacci(String num) {
        List<Integer> result = new ArrayList<>();
        backtrack(num, 0, result);
        return result;
    }
    private boolean backtrack(String num, int index, List<Integer> result) {
        if (index == num.length()) {
            return result.size() >= 3;
        }
        for (int i = index; i < num.length(); i++) {
            if (i > index && num.charAt(index) == '0') {
                break;
            }
            long value = Long.parseLong(num.substring(index, i + 1));
            if (value > Integer.MAX_VALUE) {
                break;
            }
            int size = result.size();
            if (size >= 2) {
                int sum = result.get(size - 1) + result.get(size - 2);
                if (value != sum) {
                    continue;
                }
            }
            result.add((int) value);
            if (backtrack(num, i + 1, result)) {
                return true;
            }
            result.remove(result.size() - 1);
        }
        return false;
    }
}