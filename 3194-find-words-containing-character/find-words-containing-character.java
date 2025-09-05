class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list=new ArrayList<>();
        int k=0;
        for(String s : words){
            if(s.contains(String.valueOf(x))) list.add(k);
            k++;
        }
        return list;
    }
}