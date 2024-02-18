class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int maxLength = 0;
        int n = s.length();
        int start = 0;
        for (int end = 0; end < n; end++) {
            //char x = s.charAt(end);
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start,map.get(s.charAt(end))+ 1);
                //map.get(x) will get index in hashmap not currently x
            }
            map.put(s.charAt(end), end);
            maxLength=Math.max(maxLength,(end-start+1));
        }
        return maxLength;
    }

}