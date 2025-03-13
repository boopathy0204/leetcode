class Solution {
    public int differenceOfSums(int n, int m) {
        int sumdiv=0,notdiv=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                sumdiv+=i;
            }
            else{
                notdiv+=i;
            }
        }
        return notdiv-sumdiv;
    }
}