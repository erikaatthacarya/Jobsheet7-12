public class vaksinasidll09 {
    nodevaksin09 head;
    int size;

    public vaksinasidll09(){
        head = null;
        size = 0;
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void addFirst(vaksinasi09 item){
        if (isEmpty()) {
            head = new nodevaksin09(null, item, null);
        }else{
            nodevaksin09 newnode = new nodevaksin09(null, item, head);
            head.prev = newnode;
            head = newnode;
        }
        size++;
    }
    public void addLast(vaksinasi09 item){
        if (isEmpty()) {
            addFirst(item);
        }else{
            nodevaksin09 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodevaksin09 newnode = new nodevaksin09(current, item, null);
            current.next = newnode;
            size++;
        }
    }
    public void add(vaksinasi09 item, int index) throws Exception{
        if (isEmpty()) {
            addFirst(item);
        }else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }else {
            nodevaksin09 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                nodevaksin09 newnode = new nodevaksin09(null, item, current);
                newnode.prev = newnode;
                head = newnode;
            }else{
                nodevaksin09 newnode = new nodevaksin09(current.prev, item, current);
                newnode.prev = current.prev;
                newnode.next = current;
                current.prev.next = newnode;
                current.prev = newnode;
            }
            size++;
        }
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
            nodevaksin09 tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data.noAntrian + "-" + tmp.data.nama + "\n");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        }else{
            System.out.println("linked list kosong");
        }
    }
    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("linked list masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        }else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    public void removeLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("linked list masih kosong,tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        nodevaksin09 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }
    public void remove(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }else if (index == 0) {
            removeFirst();
        }else{
            nodevaksin09 current = head;
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
    public vaksinasi09 getFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        return head.data;
    }
    public vaksinasi09 getLast() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked list kosong");
        }
        nodevaksin09 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }
    public vaksinasi09 get(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        nodevaksin09 tmp = head;
        for (int i = 0; i < index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }
}
