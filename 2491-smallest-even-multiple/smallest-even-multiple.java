class Solution {
    public int smallestEvenMultiple(int n) {
        int k=n;
        int value=0;
        while(true){
            if(k%n==0&&k%2==0){
               value=k;
               break;
            }
            k++;
        }
        return value;
    }
}