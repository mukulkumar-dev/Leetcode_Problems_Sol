class Solution {
    public int[] distributeCandies(int candies, int num_people) {
         int result[] = new int[num_people];
         int i=1;
         int position=0;
         while(candies>0){
            result[position++]+=candies >= i ?i:candies;
            candies-=i;
            i++;
            position%=num_people;
         }
         return result;
    }
}