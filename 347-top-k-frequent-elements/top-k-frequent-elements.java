class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int arr[]=new int[k];
        for(int i=0;i<k;i++){
            int in=0,mx=0;
            for(Integer j:mp.keySet()){
                int n=mp.get(j);
                if(n>mx){
                    mx=n;
                    in=j;
                }
            }
            mp.put(in,0);
            arr[i]=in;
        }
        return arr;
    }
}