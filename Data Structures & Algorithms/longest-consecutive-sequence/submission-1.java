class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int totalCount =1;
        int currentCount =1;
        for (int i=1 ;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1] +1){
                    currentCount +=1;
                }
                else{
                   totalCount= Math.max(totalCount, currentCount);
                   currentCount =1;
                }
            }
            
        }

        return totalCount=Math.max(totalCount, currentCount);
    }
}
