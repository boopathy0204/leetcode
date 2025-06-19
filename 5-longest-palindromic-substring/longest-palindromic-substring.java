class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sb = s.substring(i,j+1);
                if(isvalid(sb)){
                    if(res.length()<=sb.length()){
                        res=sb;
                    }
                }
            }
        }
        return res;
    }
    public static boolean isvalid(String s ){
        int right  = s.length()-1;
        int left = 0;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}