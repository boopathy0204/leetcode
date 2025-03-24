class Solution {
    public int pivotIndex(int[] nums) {
     int n=nums.length;
     int pre[]=new int[n];
     int suf[]=new int[n];
     int sum=0;
    for(int i=1;i<n;i++){
        sum+=nums[i-1];
        pre[i]=sum;
    }
    pre[0]=0;
     sum=nums[n-1]+sum;
    for(int i=0;i<n;i++){
        sum-=nums[i];
        suf[i]=sum;
    }
    suf[n-1]=0;
    for(int i=0;i<n;i++){
        if(pre[i]==suf[i]){
            return i;
        }
    }  
     return -1;
    }
}