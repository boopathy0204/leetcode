class Solution {
    public String mergeAlternately(String word1, String word2) {
        char []ch=word1.toCharArray();
        char ch1[]=word2.toCharArray();
        int n=ch.length;
        int m=ch1.length;
        int max=Math.max(n,m);
        word1="";
        for(int i=0;i<max;i++){
            if(n>i){
                word1+=ch[i];
            }
            if(m>i){
                word1+=ch1[i];
            }
        }
        return word1;
    }
}