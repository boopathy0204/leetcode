class Solution {
    public int findLucky(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int mx=0;
        for(int i:arr){
            if(i==mp.get(i)){
                mx=Math.max(mx,i);

            }
        }
        if(mx!=0) return mx;
        return -1;
    }
}