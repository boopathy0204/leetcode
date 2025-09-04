class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;
        int max=0;
        while(right>left){
            if(height[right]>height[left]){
                max=Math.max(max,(right-left)*height[left]);
                left++;
            }
            else{
                max=Math.max(max,(right-left)*height[right]);
                right--;
            }
        }
        return max;
    }
}