class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            int k=i;
            for(int j=0;j<matrix.length;j++){
                if(k<matrix[0].length && matrix[j][k]!=matrix[0][i]){
                    return false;
                }
                k++;
            }
        }
        for(int i=1;i<matrix.length-1;i++){
           int k=0;
            for(int j=i+1;j<matrix.length;j++){
                if(++k<matrix[0].length && matrix[i][0]!=matrix[j][k]){
                    return false;
                }
            }
        }
        return true;
    }
}