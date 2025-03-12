class Solution {
    public String interpret(String command) {
        int n=command.length();
        String s="";
        char[]ch=command.toCharArray();
        for(int i=0;i<n-1;i++){
            if(ch[i]=='('&&ch[i+1]==')'){
                s+="o";
            }
            else if(ch[i]=='('||ch[i]==')'){
                continue;
            }
            else{
                s+=String.valueOf(ch[i]);
            }
        }
        if(Character.isLetter(ch[n-1])){
            s+=ch[n-1];
        }
        return s;
    }
}