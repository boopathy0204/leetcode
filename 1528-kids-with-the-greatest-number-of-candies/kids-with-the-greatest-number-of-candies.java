class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
       int max=0;
       for(int i:candies){
        if(i>max){
            max=i;
        }
       }
        for(int a:candies){
            if(a+extraCandies>=max)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}