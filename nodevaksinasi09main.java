import java.util.Scanner;

public class nodevaksinasi09main {
    public static void menu(){
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSINASI EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println();
        System.out.println("1. Tambah data penerima vaksin");
        System.out.println("2. Hapus data penerima vaksin");
        System.out.println("3. Daftar penerima vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++++++");
    }
    public static void main(String[] args) throws Exception {
        vaksinasidll09 dll = new vaksinasidll09();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do{
            menu();
            pilihan = sc.nextInt(); 
            switch (pilihan) {
                case 1:
                    System.out.println("===================================");
                    System.out.println("Masukkan data penerima vaksin");
                    System.out.println("===================================");
                    System.out.println("Nomor antrian : ");
                    int noAntrian = sc.nextInt();
                    System.out.println("Nama penerima : ");
                    String nama = sc.next();
                    vaksinasi09 nb = new vaksinasi09(noAntrian, nama);
                    dll.addLast(nb);
                    System.out.println();
                    break;
                case 2:
                    vaksinasi09 penerima = dll.getFirst();
                    System.out.println(penerima.nama + "telah divaksin");
                    dll.removeFirst();
                    break;
                case 3:
                    System.out.println("===================================");
                    System.out.println("Daftar pengantri vaksin");
                    System.out.println("===================================");
                    dll.print();
                    System.out.println("Sisa antrian : "+ dll.size());
                    System.out.println();
                    break;
                case 4: 
                    return;
            }
        }while(pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4);
    }
}
