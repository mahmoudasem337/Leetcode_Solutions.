class MyHashMap {
    private static final int SIZE = 1000;
    private List<Pair>[] buckets;

    // Pair to store key-value
    private class Pair {
        int key, value;
        Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                pair.value = value; // Update
                return;
            }
        }

        buckets[index].add(new Pair(key, value)); // Insert
    }

    public int get(int key) {
        int index = hash(key);
        if (buckets[index] == null)
            return -1;

        for (Pair pair : buckets[index]) {
            if (pair.key == key) {
                return pair.value;
            }
        }

        return -1;
    }

    public void remove(int key) {
        int index = hash(key);
        if (buckets[index] == null) return;

        Iterator<Pair> it = buckets[index].iterator();
        while (it.hasNext()) {
            if (it.next().key == key) {
                it.remove();
                return;
            }
        }
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */