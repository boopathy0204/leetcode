class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        int count=0;
        Arrays.sort(nums);
            for(int i=0;i<n;i+=count){
                count =0;
                for(int j=i;j<n;j++){
                    if(nums[i]==nums[j]){
                        count++;
                    }
                }
                if(count%2!=0){
                    return false;
                }
            }
        return true;
    }
}