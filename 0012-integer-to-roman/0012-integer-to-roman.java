class Solution {
    public String intToRoman(int num) {
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String res = "";
        int n = arr.length;
        for(int i=0;i<n;i++){
            while(num>=arr[i]){
                res+=s[i];
                num-=arr[i];
            }
        }
        return res;
    }
}