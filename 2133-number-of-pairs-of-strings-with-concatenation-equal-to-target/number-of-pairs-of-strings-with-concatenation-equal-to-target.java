class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                String s=nums[i]+nums[j];
                if(s.equals(target)){
                    count++;
                } s="";
                }
               
            }
        }
        return count;
    }
}