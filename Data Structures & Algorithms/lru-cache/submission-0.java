class LRUCache {
   class Node {
        Node next,prev;
        int k;
        int v;
        public Node(int k ,int v){
            this.k = k;
            this.v = v;
        }
    }
    HashMap<Integer,Node> map = new HashMap<>();
    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
       if(map.containsKey(key)){
       Node n = map.get(key);
       remove(n);
       insert(n);
       return n.v;
       }else{
        return -1;
       }
    
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
        }
        if(map.size() == capacity){
            remove(tail.prev);
        }
        Node nw = new Node(key,value);
        map.put(key,nw);
        insert(nw);
    }
    public void remove(Node nn){
        if(!map.containsKey(nn.k))return;
       map.remove(nn.k);
    nn.prev.next = nn.next;
    nn.next.prev = nn.prev;
    }
    public void  insert(Node nn){
        
        map.put(nn.k,nn);
        nn.next = head.next;

        nn.next.prev = nn;
        head.next = nn;
        nn.prev = head;

    }
}
