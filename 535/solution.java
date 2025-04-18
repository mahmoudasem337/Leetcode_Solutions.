public class Codec {
    //O(1),O(N)
    HashMap<String, String> map = new HashMap<>();
    public Random random = new Random();
    public Codec() {
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        //High Collisions.
    /*
    String key_code = "http://tinyurl.com/" + longUrl.charAt(longUrl.length()-1);
    map.put(key_code, longUrl);
    return key_code;
    */
        String k = generateRandomKey();
        String key = "http://tinyurl.com/" + k;
        map.put(key, longUrl);
        return key;
    }

    public String generateRandomKey() {
        String CHAR_POOL = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int KEY_LENGTH = 3;
        String sb = new String();
        for (int i = 0; i < KEY_LENGTH; i++) {
            int index = random.nextInt(CHAR_POOL.length());
            sb.append(CHAR_POOL.charAt(index));
        }
        return sb.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

}