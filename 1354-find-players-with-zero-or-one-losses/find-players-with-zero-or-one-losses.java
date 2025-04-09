class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> win=new ArrayList<>();
        List<Integer> lose=new ArrayList<>();
        int arr1[]=new int[100001];
        int arr2[]=new int[100001];
        for(int i=0;i<matches.length;i++){
           arr1[matches[i][0]]++;
        }
        for(int i=0;i<matches.length;i++){
           arr2[matches[i][1]]++;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>=1&&arr2[i]==0){
                win.add(i);
            }
            if(arr2[i]==1){
                lose.add(i);
            }
        }
        list.add(win);
        list.add(lose);
        return list;
    }
}