class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<n;i++){
        ArrayList<Integer> l2=new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                l2.add(1);
            }
            else{
                l2.add(l1.get(j)+l1.get(j-1));
            }
        }
        list.add(l2);
        l1=l2;            
        }
        return list;
    }
}