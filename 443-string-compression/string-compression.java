class Solution {
    public int compress(char[] chars) {
        int index=0;
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            if(count==1){
                chars[index++]=ch;
            }else{
                chars[index++]=ch;
                for(char digit:Integer.toString(count).toCharArray()){
                    chars[index++]=digit;
                }
            }
            i--;
        }
        return index;
    }
}