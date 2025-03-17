class Solution {
    public int smallestNumber(int n) {
        String s=Integer.toBinaryString(n);
        int l=s.length();
        s="";
        for(int i=0;i<l;i++){
            s+="1";
        }
        
        return Integer.parseInt(s,2);

    }
}