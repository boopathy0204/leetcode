class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int i = 0, left = 0, right = 0, k = 0, count = 0;
        ArrayList<ArrayList<Integer>> orginal = new ArrayList<>();
        for (int[] g : groups) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int val : g)
                inner.add(val);
            orginal.add(inner);
        }
        while (i < groups.length) {
            ArrayList<Integer> list = new ArrayList<>();
            while (right < nums.length) {
                list.add(nums[right]);
                if (list.size() >= orginal.get(k).size()) {
                    if (orginal.get(k).equals(list)) {
                        count++;
                        k++;
                        list.clear();
                        break;
                    }
                    list.remove(0);
                }
                right++;
            }
            right++;
            i++;
        }
        return count == groups.length;
    }
}