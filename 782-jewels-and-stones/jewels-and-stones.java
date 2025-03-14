class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] ch=stones.toCharArray();
        char[] ch1=jewels.toCharArray();
        int n=ch.length;
        int n1=ch1.length;
        int count=0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n;j++){
                if(ch[j]==ch1[i]){
                    count++;
                }
            }
        }
        return count;
    }
}