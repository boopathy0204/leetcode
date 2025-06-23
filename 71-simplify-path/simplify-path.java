class Solution {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");Stack<String> stack=new Stack<>();
        for(String str:arr){
            if(str.equals("")||str.equals(".")) continue;
            if(str.equals("..")) {
                if(!stack.isEmpty()){
                    stack.pop();
                }                            
            }else{
                stack.push(str);
            }
        }
            StringBuilder res=new StringBuilder();
            for( String str:stack){
                res.append("/").append(str);
            }if(res.length()==0) return "/";
            return res.toString();
        
    }
}