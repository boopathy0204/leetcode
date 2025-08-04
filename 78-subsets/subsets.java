class Solution {
    public List<List<Integer>> subsets(int[] nums) {
   List<List<Integer>> list=new ArrayList<>();
        List<Integer> ls=new ArrayList<>();
        pr(0,list,nums,ls);
        return list;
    }
    public static void pr(int index,List<List<Integer>>list,int[] nums,List<Integer> ls){
        list.add(new ArrayList<>(ls));
        for(int i=index;i<nums.length;i++){
            ls.add(nums[i]);
            pr(i+1,list,nums,ls);
            ls.remove(ls.size()-1);
            
        }
    }
}