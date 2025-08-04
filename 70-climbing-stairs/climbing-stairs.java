class Solution {
    public int climbStairs(int n) {
        int x=0;
        int y=1;
        int c=0;
        while(n>0){
            int xy=x+y;
            x=y;
            y=xy;
            n--;
        }
        return y;
    }
}