public class LinkedList {
    private Entry entry;
    private LinkedList next;

    public LinkedList(Entry entry) {
        this.entry = entry;
        this.next = null;
    }

    public void setNext(LinkedList nxt) {
        this.next = nxt;
    }

    public Entry entry() {
        return entry;
    }

    public LinkedList next() {
        return next;
    }

    public boolean hasNext() {
        if(next == null){
            return false;
        } else {
            return true;
        }
    }
}
