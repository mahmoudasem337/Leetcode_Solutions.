class Solution {
    public int maxNumberOfBalloons(String text) {
        //O(N),O(N)
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);

        for(Character c : text.toCharArray()) {
            if(map.containsKey(c))
                map.put(c, map.get(c) + 1);
        }

        map.put('l', map.get('l') / 2);
        map.put('o', map.get('o') / 2);

        int num = Integer.MAX_VALUE;
        for(Character c : map.keySet()) {
            num =Math.min(num,map.get(c));
        }
        return num;
    }
}