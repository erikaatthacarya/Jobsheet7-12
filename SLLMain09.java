public class SLLMain09 {
    public static void main(String[] args) {
        LinkedList09 myLinkedList09 = new LinkedList09();
        myLinkedList09.print();
        myLinkedList09.addFirst(800);
        myLinkedList09.print();
        myLinkedList09.addFirst(700);
        myLinkedList09.print();
        myLinkedList09.addLast(500);
        myLinkedList09.print();
        myLinkedList09.insertAfter(700, 300);
        myLinkedList09.print();

        System.out.println("Data pada index ke-1: " + myLinkedList09.getData(1));
        System.out.println("Data 300 berada pada index ke: " + myLinkedList09.indexOf(300));

        myLinkedList09.remove(300);
        myLinkedList09.print();
        myLinkedList09.removeFirst();
        myLinkedList09.print();
        myLinkedList09.removeLast();
        myLinkedList09.print();

        myLinkedList09.insertBefore(800, 450);
        myLinkedList09.print();
        myLinkedList09.insertAfter(450, 600);
        myLinkedList09.print();
        myLinkedList09.removeAt(2);
        myLinkedList09.print();
    }
}

