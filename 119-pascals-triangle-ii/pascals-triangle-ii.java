class Solution {
    public List<Integer> getRow(int n) {
        ArrayList<Integer> l1=new ArrayList<>();
        for(int i=0;i<=n;i++){
        ArrayList<Integer> l2=new ArrayList<>();int k=0;
        for(int j=0;j<=i;j++){
            if(j==0||j==i){
                l2.add(1);
            }
            else{
                l2.add(l1.get(k)+l1.get(k+1));
                k++;
            }
        }
        l1=l2;            
        }
        return l1;
    }
}
