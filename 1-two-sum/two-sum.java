class Solution {
    public int[] twoSum(int[] nums, int target) {
         for (int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int numa=nums[i]+nums[j];
                if(numa==target){
                     return new int[]{i,j};
                }
            }
         }
         return new int[]{};
    }
}
