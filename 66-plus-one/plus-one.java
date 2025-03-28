class Solution {
    public int[] plusOne(int[] digits) {
     int l=digits.length-1;
     int[] arr=new int[l+2];
     for(int i=l;i>=0;i--){
        int val=digits[i]+1;
        if(val!=10){
            digits[i]=val;
            return digits;
        } 
        else{
            digits[i]=0;
        }
     }
     if(digits[0]==0){
        arr[0]=1;
     }
        return arr;
     
    }
}