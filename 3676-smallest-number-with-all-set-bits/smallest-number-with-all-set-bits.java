class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        char[] ch=s.toCharArray();
        int l=s.length();
        String ss="";
        for(int i=0;i<l;i++){
            ss+="1";
        }
        int num=Integer.parseInt(ss,2);
        return num;

    }
}