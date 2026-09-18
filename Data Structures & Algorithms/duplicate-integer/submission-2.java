class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer,Integer> hash = new Hashtable<>();
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(nums[i])== false){
                hash.put(nums[i],0);
            }
            else{
                return true;
            }
            
        }
        return false;
    
        
    }
}