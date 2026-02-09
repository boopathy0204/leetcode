class Solution {
    ArrayList<List<Integer>> list=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean used[]=new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),used);
        return list;
    }
    
    public void backtrack(int nums[],ArrayList<Integer> ls, boolean[] used){
        if(ls.size() == nums.length){
            list.add(new ArrayList<>(ls));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            ls.add(nums[i]);
            backtrack(nums,ls,used);
            used[i]=false;
            ls.remove(ls.size()-1);
        }
    }
}