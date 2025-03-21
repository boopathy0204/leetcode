class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        char [] ch=s.toCharArray();
        int frq[]=new int[128];
        for(char c:ch) frq[c]++;
        StringBuilder sb=new StringBuilder();
        while(true){
            int max=0;
            char chmax=0;
            for(int i=0;i<128;i++){
                if(frq[i]>max){
                    max=frq[i];
                    chmax=(char)(i);
                }
            }
            sb.append(String.valueOf(chmax).repeat(max));
            frq[chmax]=0;
            if(max==0)break;
        }
        return sb.toString();
    }
}