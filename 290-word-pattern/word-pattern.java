class Solution {
    public boolean wordPattern(String pattern, String s) {
      Map<Character,String> mp=new HashMap<>();
      Set<Character> hs=new HashSet<>();
       Set<String> hs1=new HashSet<>();
       String[] ss=s.split(" ");
       char[] ch=pattern.toCharArray();
        for(char i:ch){
        hs.add(i);
      }
      for(String i:ss){
        hs1.add(i);
      }
      if(hs.size()-hs1.size()==0&&ss.length-ch.length==0){
       for(int i=0;i<ch.length;i++){
            mp.put(ch[i],ss[i]);
       }
        for(int i=0;i<ch.length;i++){
            if(!ss[i].equals(mp.get(ch[i]))){
                return false;
            }
        }
        return true;
      }
      return false;
    }
}
