class Solution {
    public boolean isLongPressedName(String name, String typed) {
        char ch[]=name.toCharArray();
        char arr[]=typed.toCharArray();
        if(ch[0]!=arr[0]) return false;
        int i=1;
        int j=1;
        int n=ch.length;
        int m=arr.length;
        while(j<m){
            if(i>=n){
                i=n-1;
            }
            if(ch[i] == arr[j]){
                i++;
                j++;
            }
            else{
                if(arr[j] == arr[j-1]){
                    j++;
                }
                else{
                    return false;
                }
            }
        }
        if(i==ch.length) return true;
        return false;
    }
}