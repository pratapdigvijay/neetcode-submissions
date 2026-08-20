class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> setNum = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            setNum.add(nums[i]);
        }
        if(setNum.size()< nums.length){
            return true;
        }
        return false;
    }
}