class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int st=0;
        int end=0;
        int min =Integer.MAX_VALUE;
        int sum=0;
        while(end<n){
            sum+=nums[end];         
            while(sum>=target){
                min=Math.min(min,end-st+1);
                sum-=nums[st];
                st++;
            }
            end++;
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}