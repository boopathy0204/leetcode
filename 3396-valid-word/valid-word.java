class Solution {
    public boolean isValid(String word) {
        String s="aeiouAEIUO";
        String ss="qwrtypsdfghjklzxcvbnmQWRTYPSDFGHJKLZXCVBNM";
        if(word.length()<3){
            return false;
        }
        int c=0,v=0,d=0,n=0;
        for(int i=0;i<word.length();i++){
            if(Character.isDigit(word.charAt(i))){
                d++;
            }
            else if(s.contains(String.valueOf(word.charAt(i)))){
                v++;
            }
            else if(ss.contains(String.valueOf(word.charAt(i)))){
                c++;
            }
            else {
                n++;
            }
        }
        if(c>0&&v>0&&n==0) {return true;}
        return false;
    }
}