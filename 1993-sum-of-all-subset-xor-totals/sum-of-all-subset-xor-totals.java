class Solution {
        private int sum=0;
    public int subsetXORSum(int[] arr) {
         sum=0;
        sb(arr,0,new ArrayList<>());
        return sum;
        }
    public  void sb(int[] arr,int n,ArrayList<Integer>list){
        int s=0;
        if(!list.isEmpty()) {
             s = list.get(0);
            for (int j = 1; j < list.size(); j++) {
                s ^= list.get(j);
            } sum+=s;
        }

        for(int i=n;i<arr.length;i++){
            list.add(arr[i]);
            sb(arr,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
