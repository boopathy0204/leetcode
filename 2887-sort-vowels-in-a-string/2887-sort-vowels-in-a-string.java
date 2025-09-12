class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        String ss="AEIOUaeiou";
        char[] ch=s.toCharArray();
        for(char i: ch){
            if(ss.contains(String.valueOf(i))){
                list.add(i);
            }
        }
        Collections.sort(list);
        int k=0;
        StringBuilder sp=new StringBuilder();
         for(int i=0;i<ch.length;i++){
            if(ss.contains(String.valueOf(ch[i]))){
                sp.append(list.get(k++));
            }
            else{
                sp.append(ch[i]);
            }
        }
        return sp.toString();
    }
}