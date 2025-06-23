class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(!Character.isDigit(c)){
                stack.push(c);
            }
            else{
                stack.pop();
            }
        }
        Object[] res=stack.toArray();
        String ss="";
        for(int i=0;i<res.length;i++){
            ss+=res[i];
        }
        

        return ss;
    }
}