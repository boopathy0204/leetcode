class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length-1;
        while(n>=0){
            for(int j=0;j<n;j++){
                    nums[j]=(nums[j]+nums[j+1])%10;;
                }
                n--;
        }
        return nums[0];
    }
}