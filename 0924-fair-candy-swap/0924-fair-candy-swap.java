class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum=0,sum1=0;
        for(int i : aliceSizes) sum+=i;
        for(int i : bobSizes) sum1+=i;
        for(int i : aliceSizes){
            for(int j:bobSizes){
                int box=(sum-i)+j;
                int box1=(sum1-j)+i;
                if(box == box1)
                    return new int[] {i,j};
            }
        }
        return new int[]{};
    }
}