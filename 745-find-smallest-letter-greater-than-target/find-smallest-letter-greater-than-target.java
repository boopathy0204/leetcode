class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
        if((int)target<(int)letters[i]){
            min=Math.min((int)letters[i],min);
        }
        }
        if(min==Integer.MAX_VALUE){return letters[0];}
        return (char)min;
    }
}