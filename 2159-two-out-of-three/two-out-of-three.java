class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list=new ArrayList<>();
        int count=0;
        int [] arr=new int[101];
        int [] arr1=new int[101];
        int [] arr2=new int[101];     
        for(int a:nums1) arr[a]=1;
        for(int a:nums2) arr1[a]=1;
        for(int a:nums3) arr2[a]=1;
        for(int i=1;i<101;i++){
            count=0;
            if(arr[i]==1) count++;
            if(arr1[i]==1) count++;
            if(arr2[i]==1) count++;
            if(count>=2){
                list.add(i);
            }
        }
        return list;
    }
}