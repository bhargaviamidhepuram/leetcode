class Node{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key, int val){
        this.key = key;
        this.val = val;
    }
}
class LRUCache {
    int capacity;
    Node head, tail;
    HashMap<Integer, Node> hm;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        tail.prev = head;
        head.next = tail;
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
            return exist.val;  
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(hm.containsKey(key)){
            delete(hm.get(key));
            hm.remove(key);
        }
        Node lru = new Node(key, value);
        hm.put(key, lru);
        add(lru);
        if(hm.size() > capacity){
            Node exist = tail.prev;
            delete(exist);
            hm.remove(exist.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */