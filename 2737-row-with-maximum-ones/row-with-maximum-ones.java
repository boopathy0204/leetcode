class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int count =0;
        int max=0;
        int row=0;
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                    count ++;
                }
            }
            if(count>max){
                max=count;
                row=i;
            }
        }
        return new int[]{row,max};
    }
}