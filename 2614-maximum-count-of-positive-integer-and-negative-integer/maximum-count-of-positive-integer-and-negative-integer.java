class Solution {
    public int maximumCount(int[] nums) {
        int postivecount=0;
        int negativecount=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                postivecount++;
            }
            else if(nums[i]<0&&nums[i]!=0){
                negativecount++;
            }
        }
        return Math.max(postivecount,negativecount);
    }
}