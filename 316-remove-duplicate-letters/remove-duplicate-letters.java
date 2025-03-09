class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),i);
        }
        Stack<Character> stack=new Stack<>();
        Set<Character> visit=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(visit.contains(s.charAt(i))){
                continue;
            }
            while(!stack.isEmpty() && s.charAt(i)<stack.peek() && i<mp.getOrDefault(stack.peek(),-1)){
                visit.remove(stack.pop());
            }
            visit.add(s.charAt(i));
            stack.push(s.charAt(i));
        }
        StringBuilder result=new StringBuilder();
        for(char ch:stack){
            result.append(ch);
        }
        return result.toString();
    }
}