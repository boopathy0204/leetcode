class Solution {
    public boolean strongPasswordCheckerII(String p) {
        if(p.length()<8) return false;
        int n=p.length();
        char[]ch=p.toCharArray();
       int up=0;
       int lp=0;
       int d=0;
       int sp=0;
       for(int i=0;i<n;i++){
        if(i<n-1&&ch[i]==ch[i+1]) return false;
        if(Character.isUpperCase(ch[i])) up++;
        if(Character.isLowerCase(ch[i])) lp++;
        if(Character.isDigit(ch[i])) d++;
        if("!@#$%^&*()-+".indexOf(ch[i])!=-1) sp++;
       }
       if(up==0||lp==0||d==0||sp==0) return false;
       return true;
    }
}