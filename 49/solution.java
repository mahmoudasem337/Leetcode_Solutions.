class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //O(NM log M),O(NM)
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word : strs){
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
