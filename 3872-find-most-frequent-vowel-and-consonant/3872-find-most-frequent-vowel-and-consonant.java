class Solution {
    public int maxFreqSum(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        Map<Character,Integer> con=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'|| c=='E'||c=='e'||c=='o'||c=='i'||c=='u'||c=='A'||c=='O'||c=='I'||c=='U'){
                mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            }
            else con.put(s.charAt(i),con.getOrDefault(s.charAt(i),0)+1);
        }
        int max=0;
        int max1=0;
        for(Integer i : mp.values()){
            max=Math.max(i,max);
        }
        for(Integer i : con.values()){
            max1=Math.max(i,max1);
        }
        return max+max1;
    }
}