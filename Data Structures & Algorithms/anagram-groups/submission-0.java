class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //initialise hashmap
        Map<String, List<String>> hash = new HashMap<>();
        //for each string from i to the end of the array
        for(String i : strs){
            //make char array
            char[] charArray = i.toCharArray();
            //sort in order
            Arrays.sort(charArray);
            //new string out of the array
            String sortedS = new String(charArray);
            // first assume empty, if not there make a new key
            if(!hash.containsKey(sortedS)){
                hash.put(sortedS, new ArrayList<>());
            }
            hash.get(sortedS).add(i);
        }
        return new ArrayList<>(hash.values());
    }
}
