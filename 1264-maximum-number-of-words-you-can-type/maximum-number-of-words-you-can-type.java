class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] sp=text.split(" ");
        String[] sp1=brokenLetters.split("");
        int c=0;
        for(String i : sp){
            boolean flag =true;
            for(String j : sp1){
                if(i.contains(j)  && brokenLetters.length() !=0){
                    flag = false;
                    break;
                }
            }
            if(flag) c++;
        }
        return c;
    }
}