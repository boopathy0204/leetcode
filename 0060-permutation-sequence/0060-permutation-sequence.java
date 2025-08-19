class Solution {
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int arr[]=new int[n];int x=1;int s=1;
        for(int i=n-1;i>=0;i--){
            s*=x;
            arr[i]=s;
            list.add(x++);
        }StringBuilder sp=new StringBuilder();
        k--;
        for(int i=1;i<n;i++){
            int q=k/arr[i];
            k=k%arr[i];
            sp.append(list.get(q));
            list.remove(q);
        }
        sp.append(list.get(0));
        return sp.toString();
    }
}