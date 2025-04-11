class Solution {
    public int minimumRounds(int[] tasks) {
        Set<Integer> hs=new HashSet<>();
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:tasks){
            hs.add(i);
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int count =0;
        for(int i:hs){
            if(mp.get(i)==1){
                return -1;
            }
            else if(mp.get(i)%3==0){
                count+= mp.get(i)/3;
            }
            else{
                    count+=mp.get(i)/3+1;
                }
            }
        return count;
    }
}