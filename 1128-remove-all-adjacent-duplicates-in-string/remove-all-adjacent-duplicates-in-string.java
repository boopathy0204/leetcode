class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()){
        stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==stack.peek()){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sp=new StringBuilder();
        for(char ch:stack){
            sp.append(ch);
        }
        return sp.toString();
    }
}