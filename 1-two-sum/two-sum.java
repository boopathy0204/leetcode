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
public class sum{
    public static void main (String[] args){
        Scanner s =new Scanner (System.in);
        int nums[]={2,5,5,11};
        int target=s.nextInt();
        Solution sol=new Solution();
        sol.twoSum(nums,target);
    }
}