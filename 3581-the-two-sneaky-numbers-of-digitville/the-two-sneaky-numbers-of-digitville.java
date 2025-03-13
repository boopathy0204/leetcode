class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int arr[]=new int[2];
        int n=nums.length;
        Arrays.sort(nums);
        int index=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                arr[index++]=nums[i];
            }
        }
        return arr;
    }
}