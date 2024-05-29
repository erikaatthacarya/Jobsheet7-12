import java.util.Scanner;

public class QueueMain09 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Pasien baru");
        System.out.println("2. Pasien keluar");
        System.out.println("3. Daftar Semua Pasien");
        System.out.println("4. Cek Pasien terdepan");
        System.out.println("5. Cek Pasien belakang");
        System.out.println("6. Cek Pasien berdasarkan nama");
        System.out.println("---------------------------- ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();
        Queue09 antri = new Queue09(jumlah);
    
        int pilih;
        do {
            menu(); 
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.next();
                    System.out.print("No ID: ");
                    int no_ID = sc.nextInt();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jk =  sc.next();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt();
                    Pembelian09 nb = new Pembelian09(nama, no_ID, jk.charAt(0), umur);
                    antri.Enqueue(nb);
                    break;
                    case 2:
                    Pembelian09 data = antri.Dequeue();
                    if (data.nama.isEmpty() || data.no_ID == 0 
                            || data.umur == 0) {
                        System.out.println("Pembeli masih kosong");
                    } else {
                        System.out.println("Pembeli yang keluar: " + data.nama + " " + data.no_ID + " "
                                + data.jk + " " + data.umur );
                    }
                    break;
                case 3:
                    antri.daftarPasien();
                    break;
                case 4:
                    antri.peek();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan Nama :");
                    String getNama = sc.next();
                    antri.peekPosition(getNama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}

