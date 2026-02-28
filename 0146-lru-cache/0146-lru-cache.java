class Node{
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
        this.prev = null;
    }
}
class LRUCache {
    int capacity;
    Node head, tail;
    HashMap<Integer, Node> hm;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        hm = new HashMap<>();
    }
    public void add(Node n){
        n.next = head.next;
        n.prev = head;
        head.next.prev = n;
        head.next = n;
    }
    public void delete(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;
    }
    public int get(int key) {
        if(hm.containsKey(key)){
            Node exist = hm.get(key);
            delete(exist);
            add(exist);
            return exist.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            delete(hm.get(key));
            hm.remove(key);
        }
        Node newnode = new Node(key, value);
        hm.put(key, newnode);
        add(newnode);
        if(hm.size() > capacity){
            Node m = tail.prev;
            delete(m);
            hm.remove(m.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */