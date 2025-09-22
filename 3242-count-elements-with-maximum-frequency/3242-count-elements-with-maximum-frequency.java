class Solution {
    public int maxFrequencyElements(int[] nums) {
        int frequency[]= new int[nums.length];
        int count=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i+=count){
            count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
                else break;
            }
            frequency[i]=count;
        }
        int sum=0;
        Arrays.sort(frequency);
        for(int i=frequency.length-1;i>0;i--){  
            if(frequency[i] == frequency[i-1]){
                 sum+=frequency[i];
            }
            else {
                sum+=frequency[i]; 
                break;
            }
        }
        if(frequency[frequency.length-1] == frequency[0]) sum+=frequency[0];
        return sum;
    }
}