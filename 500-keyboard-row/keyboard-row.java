class Solution {
    public String[] findWords(String[] words) {
        String s="qwertyuiopQWERTYUIOP";
        String s1="ASDFGHJKLasdfghjkl";
        String s2="ZXCVBNMzxcvbnm";
        ArrayList<String> list=new ArrayList<>();
        for(String i:words){
            char[] ch=i.toCharArray();
            int c=0,c1=0,c2=0;
            for(char j:ch){
                if(s.contains(String.valueOf(j))){
                    c++;
                }
                else if(s1.contains(String.valueOf(j))){
                    c1++;
                }
                else{
                    c2++;
                }
            }
            if(c==i.length()||c1==i.length()||c2==i.length()){
                list.add(i);
            }
        }
    String[] arr=new String[list.size()];
    for(int i=0;i<list.size();i++){
        arr[i]=list.get(i);
    }
    return arr;
    }
}