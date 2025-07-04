class Solution {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(char move: moves.toCharArray()){
            if( move == 'U')
                y++;
            else if( move == 'D')
                y--;
            else if(move == 'L')
                x--;
            else
                x++;
        }
        return (x==0 && y==0);
    }
}