class Solution {
    public int calPoints(String[] o) {
        Stack<Integer> stack=new Stack<>();
        for(String s:o){
             if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("D")){
                int n=stack.peek()*2;
                stack.push(n);
            }
            else if(s.equals("+")){
                int n=stack.get(stack.size()-2);
                int m=n+stack.peek();
                stack.push(m);
            }
            else if(s.equals("-")){
                int n=stack.get(stack.size()-2);
                int m=n-stack.peek();
                stack.push(m);
            }
            else{
                int n=Integer.parseInt(s);
                stack.push(n);
            }
        }
        int sum=0;
            while(!stack.isEmpty()){
                sum+=stack.pop();
            }
            return sum==0 ? 0:sum;
    }
}