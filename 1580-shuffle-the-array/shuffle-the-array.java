class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int arr[]=new int[l];
        int k=0;
        for(int i=0;i<l-n;i++){
            arr[k++]=nums[i];
            arr[k++]=nums[i+n];
        }
        return arr;
    }
}