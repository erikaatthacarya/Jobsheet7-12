public class Struk09 {
    int nomorTransaksi, jumlahBarang;
    String tanggalPembelian;
    int totalHargaBayar;
    int size;
    int top;
    Struk09 data[];
    Struk09[] stk;

    public Struk09(int no, String tgl, int jum, int total) {
        nomorTransaksi = no;
        tanggalPembelian = tgl;
        jumlahBarang = jum;
        totalHargaBayar = total;
    }

    public Struk09(int size) {
        this.size = size;
        data = new Struk09[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Struk09 dt) {
        if (!isFull()) {
            top++;
            data[top] = dt;
        } else {
            System.out.println("stack penuh!!");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Struk09 x = data[top];
            top--;
            System.out.println("Data yang keluar: " + x.nomorTransaksi + " " + x.tanggalPembelian + " " + x.jumlahBarang
                    + " " + x.totalHargaBayar + " ");
        } else {
            System.out.println("stack kosong");
        }
    }

    public void print() {
        System.out.println("isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].nomorTransaksi + " " + data[i].tanggalPembelian + " " + data[i].jumlahBarang
                    + " " + data[i].totalHargaBayar + " ");
        }
        System.out.println("");
    }

    public void clear() {
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("stack sudah kosong");
        } else {
            System.out.println("gagal! stack kosong");
        }
    }

    public void peek() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'peek'");
    }
}