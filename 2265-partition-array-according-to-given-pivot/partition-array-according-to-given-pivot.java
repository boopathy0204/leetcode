class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[]=new int[nums.length];
        int k=0;
        for(int i : nums){
            if(i<pivot) arr[k++] = i;
        }
        for(int i : nums){
            if(i == pivot) arr[k++] = i;
        }
        for(int i : nums){
            if(i>pivot) arr[k++] = i;
        }
        return arr;
    }
}