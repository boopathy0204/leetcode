class Solution {
    public int countWords(String[] words1, String[] words2) {
        int count=0;
       Map<String,Integer> mp=new HashMap<>();
       Map<String,Integer> mp1=new HashMap<>();
       for(String s:words1){
        mp.put(s,mp.getOrDefault(s,0)+1);
       }
       for(String s:words2){
        mp1.put(s,mp1.getOrDefault(s,0)+1);
       }
       for(String s:words1){
        if(mp.getOrDefault(s,0)==1&&mp1.getOrDefault(s,0)==1){
            count++;
        }
       }
       return count;
    }
}