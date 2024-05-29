import javax.xml.crypto.Data;

public class Queue09 {
    Pembelian09[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue09(int n){
        max = n;
        data = new Pembelian09[max];
        size = 0;
        front = rear = -1;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }
    public void peek(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].no_ID + 
            " " + data[front].jk + " " + data[front].umur);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void peekRear(){
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: " + data[rear].nama + " " + data[rear].no_ID + 
            " " + data[rear].jk + " " + data[rear].umur);
        }else{
            System.out.println("Queue masih kosong");
        }
    }
    public void print(){
        if (isEmpty()) {
            System.out.println("Queue maasih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].no_ID + 
                    " " + data[front].jk + " " + data[front].umur);
                i = (i + 1) % max;
            }
            System.out.println("Elemen terdepan: " + data[front].nama + " " + data[front].no_ID + 
            " " + data[front].jk + " " + data[front].umur);
            System.out.println("Jumlah elemen = " + size);
        }
    }
    public void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        }else{
            System.out.println("Queue maasih kosong");
        }
    }
    public void Enqueue(Pembelian09 dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        } else{
            if (isEmpty()) {
                front = rear = 0;
            }else{
                if (rear == max - 1) {
                    rear = 0;
                }else {
                    rear++;
                    }
                }
                data[rear] = dt;
                size++;
            }
        }
    public Pembelian09 Dequeue(){
        Pembelian09 dt = new Pembelian09();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            dt = data[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            }else {
                if (front == max - 1) {
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    public int peekPosition(String nama){
        if (isEmpty()) {
            return -1;
        }
        int i = front;
        int position = 0;
        while (i != rear) {
            if (data[i].nama.equals(nama)) {
                System.out.println("Nama: " + data[i].nama + ", No ID: " 
                + data[i].no_ID + ", JK: " + data[i].jk + ", Umur: " + data[i].umur);
                return position;
            }
            position++;
            i = (i + 1) % max;
        }
        if (data[i].nama.equals(nama)) {
            System.out.println("Nama: " + data[i].nama + ", No ID: " 
            + data[i].no_ID + ", JK: " + data[i].jk + ", Umur: " + data[i].umur);
            return position;
        }
        return -1;
    }
    public void daftarPasien(){
        if (isEmpty()) {
            System.out.println("Daftar pasien masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.println("Nama: " + data[i].nama + ", No ID: " 
                + data[i].no_ID + ", JK: " + data[i].jk + ", Umur: " + data[i].umur);
                i = (i + 1) % max;
            }
            System.out.println("Nama: " + data[i].nama + ", No ID: " 
            + data[i].no_ID + ", JK: " + data[i].jk + ", Umur: " + data[i].umur);

        }
    }
}

