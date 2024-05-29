import org.w3c.dom.Node;

public class LinkedList09 {
    Node09 head;

    public LinkedList09(){
        this.head = null;
    }
    public int size(){
        int count = 0;
        Node09 currentNode09 = head;
        while (currentNode09 != null) {
            count++;
            currentNode09 = currentNode09.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return (head == null);
    }
    public void print(){
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node09 currentNode09 = head;

            while (currentNode09 != null) {
                System.out.print(currentNode09.data + "\t");
                currentNode09 = currentNode09.next;
            }
            System.out.println("");
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void addFirst(int input){
        Node09 newNode09 = new Node09(input, null);

        if (isEmpty()) {
            head = newNode09;
        }else {
            newNode09.next = head;
            head = newNode09;
        }
    }
    public void addLast(int input){
        Node09 newNode09 = new Node09(input, null);
        
        if (isEmpty()) {
            head = newNode09;
        } else {
            Node09 currentNode = head;

            while (currentNode.next !=null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode09;
        }
    }
    public void insertAfter(int key, int input){
        Node09 newNode09 = new Node09(input, null);

        if (!isEmpty()) {
            Node09 currentNode09 = head;

            do{
                if (currentNode09.data == key) {
                    newNode09.next = currentNode09.next;
                    currentNode09.next = newNode09;
                    break;
                }
                currentNode09 = currentNode09.next;
            }while (currentNode09 != null);
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public int getData(int index){
        Node09 currentNode09 = head;

        for (int i = 0; i < index; i++){
            currentNode09 = currentNode09.next;
        }
        return currentNode09.data;
    }
    public int indexOf(int key){
        Node09 currentNode09 = head;
        int index = 0;

        while (currentNode09 != null && currentNode09.data != key) {
            currentNode09 = currentNode09.next;
            index++;
        }
        if (currentNode09 == null) {
            return -1;
        }else {
            return index;
        }
    }
    public void removeFirst(){
        if (!isEmpty()) {
            head = head.next;
        }else{
            System.out.println("Linked list kosong");
        }
    }
    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }else if (head.next == null){
            head = null;
        }else {
            Node09 currentNode09 = head;

            while (currentNode09.next != null) {
                if (currentNode09.next.next == null) {
                    currentNode09.next = null;
                    break;
                }
                currentNode09 = currentNode09.next;
            }
        }
    }
    public void remove(int key){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        }else if (head.data == key){
            removeFirst();
        }else{
            Node09 currentNode09 = head;

            while (currentNode09.next != null) {
                if (currentNode09.next.data == key) {
                    currentNode09.next = currentNode09.next.next;
                    break;
                }
                currentNode09 = currentNode09.next;
            }
        }
    }
    public void insertFirst(int key) {
        Node09 newNode = new Node09(key);
        newNode.next = head;
        head = newNode;
    }
    public void insertBefore(int key, int newKey) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (head.data == key) {
            Node09 newNode = new Node09(newKey, head);
            head = newNode;
            return;
        }
        Node09 currentNode09 = head;
        while (currentNode09.next != null) {
            if (currentNode09.next.data == key) {
                Node09 newNode = new Node09(newKey, currentNode09.next);
                currentNode09.next = newNode;
                return;
            }
            currentNode09 = currentNode09.next;
        }
        System.out.println("Key tidak ditemukan");
    }
    public void insertAt(int index, int key) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
        if (index == 0) {
            insertFirst(key);
            return;
        }
        Node09 currentNode09 = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode09 = currentNode09.next;
        }
        Node09 newNode = new Node09(key, currentNode09.next);
        currentNode09.next = newNode;
    }
    public void removeAt(int index) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        Node09 currentNode09 = head;
        for (int i = 0; i < index - 1; i++) {
            currentNode09 = currentNode09.next;
        }
        currentNode09.next = currentNode09.next.next;
    }
}
