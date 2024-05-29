import java.util.Scanner;

public class StackMain09 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackPakaian09 stk = new StackPakaian09(5);
        StackMain09 main = new StackMain09();

        int pilih;
        while (true) {
            System.out.println("\nPilihan:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. GetMax");
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
                    stk.getMax();
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
    public void pushPakaian(StackPakaian09 stk){
        char pilih;
        do{
        System.out.print("Jenis : ");
        String jenis = sc.next();
        System.out.print("Warna : ");
        String warna = sc.next();
        System.out.print("Merk  : ");
        String merk = sc.next();
        System.out.print("Ukuran: ");
        String ukuran = sc.next();
        System.out.print("Harga : ");
        double harga = sc.nextDouble();
        Pakaian09 p = new Pakaian09(jenis, warna, merk, ukuran, harga);
            System.out.print("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            stk.push(p);
        } while (pilih == 'y');
    }
}
    // stk.print();
    // stk.pop();
    // stk.peek();
    // stk.print();
