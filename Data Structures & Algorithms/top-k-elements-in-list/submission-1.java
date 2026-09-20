class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hash = new HashMap<>();
        //making the hashmap, putting in every
        for(int numbersin : nums){
            //update hash in index number, then hash lookup index , if nothing inside it will return 0 instead of null because of ordefault, and then 1 is adding to fill the whole thing for each time we see it
            hash.put(numbersin, hash.getOrDefault(numbersin,0) + 1);
        }
        //we are going to bucket sort? list of integers organised by the index which represents how many times it showed up and the corresponding number which is the numbers that appears that many times.
        // initialise new list as the length of original array, as the length is 7? array will only go from 0-6, so we need 7 as 7 is the max times a number can appear. IMAGINE the array is int array[]= {1,1,1,1,1,1,1} 1 appears 7 times and reading data from the hashmap wouldnt work if we just put it as the length of the array THINK ABOUT IT....
        List<Integer>[] buckets = new List[nums.length + 1];
        // for each key in the hash.keySet() ---> lists all keys
        for(int value : hash.keySet()){
            int frequency = hash.get(value);
            //if the list
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(value);
        }
        int[] result = new int[k];

        int index = 0;
        for(int i = buckets.length - 1; i>= 0 && index < k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[index++] = num;
                    if(index == k) break;
                }
            }
        }
        return result;
        
        
    }
}
