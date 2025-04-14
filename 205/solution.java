class Solution {
    public boolean isIsomorphic(String s, String t) {
        //O(N),O(1)
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapst = new HashMap<>();
        Map<Character, Character> mapts = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapst.containsKey(charS)) {
                if (mapst.get(charS) != charT)
                    return false;
            } else {
                mapst.put(charS, charT);
            }

            if (mapts.containsKey(charT)) {
                if (mapts.get(charT) != charS)
                    return false;
            } else {
                mapts.put(charT, charS);
            }
        }
        return true;
    }
}