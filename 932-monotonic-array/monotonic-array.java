class Solution {
    public boolean isMonotonic(int[] nums) {
        int count=1;int count1=1;
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }
            if(nums[i]>=nums[i+1]){
                count1++;
            }
        }
        if(count==n||count1==n){
            return true;
        }
        return false;
    }
}