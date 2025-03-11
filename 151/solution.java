class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder s2 = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            s2.append(words[i]);
            if (i != 0) {
                s2.append(" ");
            }
        }
        return s2.toString();
    }
}