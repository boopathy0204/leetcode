class Solution {
    public boolean isMonotonic(int[] nums) {
        int count=1;int count1=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                count++;
            }
            if(nums[i]>=nums[i+1]){
                count1++;
            }
        }
        if(count==nums.length||count1==nums.length){
            return true;
        }
        return false;
    }
}