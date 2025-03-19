class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] ch=s.toCharArray();
        int st=0;
        int end=0;
        int max=0;
        List<Character> list=new ArrayList<>();
       while(end<ch.length){
        if(!(list.contains(ch[end]))){
            list.add(ch[end]);
            end++;
            max=Math.max(max,list.size());
        }
        else{
            list.remove(Character.valueOf(ch[st]));
            st++;
        }
       }
       return max;
    }
}