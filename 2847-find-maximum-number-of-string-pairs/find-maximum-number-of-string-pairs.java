class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int k=1,c=0,n=words.length;
        for(String i:words){
            for(int j=k;j<n;j++){
                StringBuilder sb=new StringBuilder(words[j]);
                sb.reverse();
                if(i.equals(sb.toString())){
                    c++;
                }
            }
            k++;
        }
        return c;
    }
}