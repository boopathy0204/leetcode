class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int st[]=new int[n + 1];
        int top=-1;
        int max=0;
        for(int i=0;i<=n;i++){
            int h = (i == n) ? 0 :heights[i]; 
            while(-1 != top && h < heights[st[top]]){
                int m=st[top--];
                int x=(top == -1) ? i : i-st[top]-1;
                max=Math.max(max,x*heights[m]);
            }
            st[++top]=i;
        }
        return max;
    }
}