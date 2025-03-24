class Solution {
    public int minStartValue(int[] nums) {
        int min=0,sum=0;
        for(int n:nums){
            sum+=n;
           min = Math.min(sum,min); 
        }
        return 1-min;
    }
}