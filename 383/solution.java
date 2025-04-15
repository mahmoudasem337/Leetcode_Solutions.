class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        //O(N),O(1)
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char s=magazine.charAt(i);
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char j=ransomNote.charAt(i);
            if(map.containsKey(j) && (map.get(j) > 0)){
                map.put(j,map.get(j)-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}

