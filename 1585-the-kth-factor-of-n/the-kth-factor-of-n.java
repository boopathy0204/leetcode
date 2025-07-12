class Solution {
    public int kthFactor(int n, int k) {
        return kf(n,k,1);
    }
    public static int kf(int n,int k,int f){
        if(k==0){
            return f-1;
        }
        if(n<f){
            return -1;
        }
        if(n%f==0){
            return kf(n,k-1,f+1);
        }
        else {
            return kf(n,k,f+1);
        }
    }
}