class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=Arrays.stream(candies).max().orElseThrow();
        for(int a:candies){
            if(a+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}