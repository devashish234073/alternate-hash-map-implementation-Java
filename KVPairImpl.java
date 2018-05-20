public class KVPairImpl {
    public static void main(String[] args)  {
        KVPair kv = new KVPair(10);
        kv.put("1006010","devashish");
        kv.put("1006011","abc");
        kv.put("1006012","DEF");
        kv.put("1006013","gHIj");
        kv.put("1006014","kLmNo");
        kv.put("1006015","#$*&");
        kv.put("1006016","-----");
        kv.put("1006017","._._._._.");
        kv.put("1006018","////////");
        kv.put("1006019","NOOP");
        kv.put("1006020","test5");
        kv.put("1006021","GOOF");
        kv.put("1006022","test7");
        kv.put("1006023","SOUP");
        kv.put("1006024","test9");
        kv.put("1006025","BLOOP");
        kv.put("1006026","test92");
        kv.put("1006027","DUPE");

        kv.dispHashTableKV();
    }
}
