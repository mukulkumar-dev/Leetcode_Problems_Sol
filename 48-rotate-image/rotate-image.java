class Solution {
    public void rotate(int[][] matrix) {
        int totalLength=matrix.length;
        int top=0;
        int bottom=totalLength-1;
        while(top<bottom){
            //Reverse the matrix bottom on top and top on bottom
            for(int col=0;col<totalLength;col++){
                int temp=matrix[top][col];
                matrix[top][col]=matrix[bottom][col];
                matrix[bottom][col]=temp;
            }
            bottom--;
            top++;
        }
        for(int row=0;row<totalLength;row++){
            for(int col=row+1;col<totalLength;col++){
                int temp=matrix[row][col];
                matrix[row][col]=matrix[col][row];
                matrix[col][row]=temp;
            }
        }

    }
}