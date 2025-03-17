class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        int frq[]=new int[501];
            for(int i=0;i<n;i++){
                frq[nums[i]]++;
            }
            for(int i=0;i<501;i++){
                if(frq[i]%2!=0){
                    return false;
                }
            }
        return true;
    }
}