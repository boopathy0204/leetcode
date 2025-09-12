class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        String s=Arrays.toString(friends);
        int arr[]=new int[friends.length];
        int k=0;
        for(int i : order){
            for(int j: friends)
            if(i == j){
                arr[k++]=i;
            }
        }
        return arr;
    }
}