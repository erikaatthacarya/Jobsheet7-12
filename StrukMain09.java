import java.util.Scanner;

public class StrukMain09 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Struk09 stk = new Struk09(10);
        StrukMain09 main = new StrukMain09();

        int pilih;
        while (true) {
            System.out.println("\nPilihan:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Kupon");
            System.out.println("6. Keluar");
            System.out.println("Pilih salah satu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    main.pushPakaian(stk);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    main.kupon(stk);
                    break;
                case 6:
                    System.out.println("Program selesai");
                    System.exit(0);
                default:
                System.out.println("Pilihan tidak valid.");
                break;
            }
        }
    }
    public void pushPakaian(Struk09 stk){
        char pilihan;
        do{
        System.out.print("Nomor Belanja : ");
        int nomorTransaksi = sc.nextInt();
        System.out.print("Tanggal (dd/mm/yyyy) : ");
        String tanggalPembelian = sc.next();
        System.out.print("Jumlah  : ");
        int jumlahBarang = sc.nextInt();
        System.out.print("Total Bayar: ");
        int totalHargaBayar = sc.nextInt();
        Struk09 d = new Struk09(totalHargaBayar, tanggalPembelian, jumlahBarang, totalHargaBayar);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilihan = sc.next().charAt(0);
            stk.push(d);
        } while (pilihan == 'y');
    }
    public void kupon(Struk09 stk){
        System.out.println("Data yang diambil");
        int i = 0;
        while (i < 5) {
            stk.pop();
            i++;
        }
        System.out.println();
        System.out.println("Data yang tersisa");
        stk.print();
    }
}
    

