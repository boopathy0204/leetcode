class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> mp=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for(int n:nums2){
            while(!stack.isEmpty() && n>stack.peek()){
                mp.put(stack.pop(),n);
            }
            stack.push(n);
        }
        int res[]=new int[nums1.length];
        int i=0;
        for(int n:nums1){
            res[i++]=mp.getOrDefault(n,-1);
        }
        return res;
    }
}