class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer>list=new ArrayList<>();
        Set<Integer> hs =new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }int k=1;
        while(k<=nums.length){
            if(!hs.contains(k)){
                list.add(k);
            }
            k++;
        }
        return list;
    }
}