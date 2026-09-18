class Solution {
    public boolean hasDuplicate(int[] nums) {
        //sort array first nlogn
        //then check for neighbours
        //better but could be worse 
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]){
                return true;            }
        }
        return false;
    }
}