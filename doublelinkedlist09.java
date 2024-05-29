public class doublelinkedlist09 {
    node09 head;
    int size;

    public doublelinkedlist09(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(int item){
        if (isEmpty()) {
            head = new node09(null, item, null);
        }else {
            node09 newnode = new node09(null, item, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }
    public void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            node09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            node09 newnode = new node09(current, item, null);
            current.next = newnode;
            size++;
        }
    }
    public void add(int item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        }else{
            node09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                node09 newnode = new node09(null, item, current);
                newnode.prev = newnode;
                head = newnode;
            }else{
                node09 newnode = new node09(current.prev, item, current);
                newnode.prev = current.prev;
                newnode.next = current;
                current.prev.next = newnode;
                current.prev = newnode;
            }
        }
        size++;
    }
    public int size(){
        return size;
    }
    public void clear(){
        head = null;
        size = 0;
    }
    public void print(){
        if (!isEmpty()) {
            node09 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        }else if (size == 1) {
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        node09 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size)  {
            throw new Exception("Nilai indeks di luar batas");
        }else if (index == 0) {
            removeFirst();
        }else {
            node09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            }else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            }else{
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    public film09 getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }
    public film09 getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        node09 tmp = head;
        while(tmp.next != null){
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public film09 get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        node09 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
}

