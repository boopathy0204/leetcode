class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int k=1,c=0,n=words.length;
        for(int i=0;i<n;i++){
            for(int j=k;j<n;j++){
                StringBuilder sb=new StringBuilder(words[j]);
                sb.reverse();
                if(words[i].equals(sb.toString())){
                    c++;
                    break;
                }
            }
            k++;
        }
        return c;
    }
}