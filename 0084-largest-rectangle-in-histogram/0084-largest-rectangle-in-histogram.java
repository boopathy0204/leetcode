class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int max=0;
        for(int i=0;i<=n;i++){
            int h = (i == n) ? 0 :heights[i]; 
            while(!st.isEmpty() && h < heights[st.peek()]){
                int m=st.pop();
                int x=(st.isEmpty()) ? i : i-st.peek()-1;
                max=Math.max(max,x*heights[m]);
            }
            st.push(i);
        }
        return max;
    }
}