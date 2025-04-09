class Solution {
    public int findMaxK(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                break;
            }
            for(int j=i+1;j<n;j++){
                if(Math.abs(nums[i])==nums[j]){
                    return nums[j];
                }
            }
        }
        return -1;
    }
}