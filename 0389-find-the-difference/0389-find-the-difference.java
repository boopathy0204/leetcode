class Solution {
    public char findTheDifference(String s, String t) {
        char ch[]=s.toCharArray();
        char ch1[]=t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        int i=0;
        boolean flag=false;
        if(ch.length > ch1.length) flag =true;
        while(i<ch.length && i<ch1.length){
            if(ch[i] != ch1[i]){
                if(flag) return ch[i];
                else return ch1[i];
            }
            i++;
        }
        if(flag) return ch[i];
        return ch1[i];
    }
}