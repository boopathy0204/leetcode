class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> list=new ArrayList<>();
        Map<Character,String> mp=new HashMap<>();
        mp.put('2',"abc");
        mp.put('3',"def");
        mp.put('4',"ghi");
        mp.put('5',"jkl");
        mp.put('6',"mno");
        mp.put('7',"pqrs");
        mp.put('8',"tuv");
        mp.put('9',"wxyz");
        String str=mp.get(digits.charAt(0));
        for(int i=0;i<str.length();i++){
            list.add(String.valueOf(str.charAt(i)));
        }
        for(int i=1;i<digits.length();i++){
        ArrayList<String> list1=new ArrayList<>();
            String s= mp.get(digits.charAt(i));
            for(int j=0;j<list.size();j++){
                for(int k=0;k<s.length();k++){
                    String ss=list.get(j)+String.valueOf(s.charAt(k));
                    list1.add(ss);
                }
            }
            list= list1;
        }
        return list;
        
    }
}