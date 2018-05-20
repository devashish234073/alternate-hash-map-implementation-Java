
public class KVPair {

    private LinkedList hashTable[];
    private int hashSize;

    public KVPair(int SIZE) {
        hashTable =  new LinkedList[SIZE];
        hashSize  = SIZE;
        for(int i = 0;i<hashTable.length;i++) {
            hashTable[i] = null;
        }
    }

    private int getHash(String s) {
        int val = 0;
        for(int i=0;i<s.length();i++) {
            val+=s.charAt(i);
        }
        val = val % hashSize;
        return val;
    }

    public void put(String key,String value) {
        int hash = getHash(key);
        Entry e = new Entry(key,value);
        if(hashTable[hash] == null) {
            hashTable[hash] = new LinkedList(e);
        } else {
            LinkedList ll = hashTable[hash];
            while(ll.hasNext()) {
                ll = ll.next();
            }
            ll.setNext(new LinkedList(e));
        }
    }

    public String get(String key) {
        int hash = getHash(key);
        if(hashTable[hash] == null) {
            return null;
        }
        LinkedList ll = hashTable[hash];

        do {
            if(ll.entry().getKey().equals(key)) {
                return ll.entry().getValue();
            }
            ll = ll.next();
        } while(ll != null);
        return null;
    }

    public void dispHashTable() {
        for(int i=0;i<hashTable.length;i++) {
            System.out.print("["+i+"].");
            LinkedList ll = hashTable[i];
            if(ll!=null) {
                do {
                    System.out.print("("+ll.entry().getKey()+")");
                    ll = ll.next();
                } while(ll != null);
            }
            System.out.println();
        }
    }

    public void dispHashTableKV() {
        for(int i=0;i<hashTable.length;i++) {
            System.out.print("["+i+"].");
            LinkedList ll = hashTable[i];
            if(ll!=null) {
                do {
                    System.out.print("("+ll.entry().getKey()+","+ll.entry().getValue()+")");
                    ll = ll.next();
                } while(ll != null);
            }
            System.out.println();
        }
    }
}
