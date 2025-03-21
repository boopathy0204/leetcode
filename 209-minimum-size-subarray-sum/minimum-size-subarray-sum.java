class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int st=0;
        int end=0;
        int min =Integer.MAX_VALUE;
        int sum=0;
        for(end=0;end<n;end++){
            sum+=nums[end];         
            while(sum>=target){
                min=Math.min(min,end-st+1);
                sum-=nums[st];
                st++;
            }
        }
        if(min==Integer.MAX_VALUE) return 0;
        return min;
    }
}