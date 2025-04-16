class Solution {
    public int majorityElement(int[] nums) {
        int mx=0;int ind=0;
        Map<Integer,Integer> mp=new HashMap<>();
      for(int i:nums){
        mp.put(i,mp.getOrDefault(i,0)+1);
      }
      for(int i:nums){
        if(mp.get(i)>mx){
            mx=mp.get(i);
            ind=i;
        }
      }
      return ind;
    }
}