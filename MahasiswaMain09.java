import java.util.Scanner;

public class MahasiswaMain09 {
    public static void main(String[] args) {
        int[] daftarNilai = {10,5,20,15,5,45};
        Sorting09.sequentialSearch(daftarNilai, 5);
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);
        int jumMhs;
        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan berapa banyak data ynag ingin ditambahkan : ");
        jumMhs = s.nextInt();
        
        PencarianMhs09 data = new PencarianMhs09(jumMhs);
        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil : ");
        
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-------------------------------------------------------");
            System.out.print("Nim\t  : ");
            int nim = s.nextInt();
            System.out.print("Nama\t  : ");
            String nama = sl.nextLine();
            System.out.print("Umur\t  : ");
            int umur = s.nextInt();
            System.out.print("IPK\t  : ");
            double ipk = s.nextDouble();

            Mahasiswa09 m = new Mahasiswa09(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();

        System.out.println("_________________________________________________");
        System.out.println("_________________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama: ");
        String cari = s.next();
        System.out.println("=================================================");
        System.out.println("menggunakan binary Search");

        data.countSearchName(cari);
        int posisi = data.FindBinarySearchName(cari, 0, jumMhs-1, 0);
        data.TampilposisiNama(cari, posisi);
        data.TampilposisiNama(cari, posisi);
    }  
}
