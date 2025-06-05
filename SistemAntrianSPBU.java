import java.util.Scanner;

public class SistemAntrianSPBU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KendaraanLinkedList antrianKendaraan = new KendaraanLinkedList();
        TransaksiQueue riwayat = new TransaksiQueue(100);

        while (true) {
            System.out.println("\n--- Menu SPBU ---");
            System.out.println("1. Tambah Antrian Kendaraan");
            System.out.println("2. Tampilkan Antrian");
            System.out.println("3. Cek Jumlah Antrian Kendaraan");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih : ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor : ");
                    String plaNomor = sc.nextLine();
                    System.out.print("Masukkan Jenis Kendaraan  : ");
                    String jenisKendaraan = sc.nextLine();
                    System.out.print("Masukkan Merk : ");
                    String merk = sc.nextLine();

                    Kendaraan kendaraanBaru = new Kendaraan(plaNomor, jenisKendaraan, merk);
                    antrianKendaraan.addLast(kendaraanBaru);
                    break;

                case 2:
                    antrianKendaraan.displayAntrian();
                    break;

                case 3:
                    System.out.println(">> Jumlah kendaraan dalam antrian : " + antrianKendaraan.getSize());
                    break;

                case 4:
                    Kendaraan kendaraanDilayani = antrianKendaraan.removeFirst();
                    System.out.println("Petugas melayani " + kendaraanDilayani.platNomor);

                    System.out.print("Masukkan Jenis BMM : ");
                    String jenisBBM = sc.nextLine();
                    System.out.print("Masukkan Harga per Liter : ");
                    double hargaPerLiter = sc.nextDouble();
                    System.out.print("Masukkan Jumlah Liter : ");
                    double jmlLiter = sc.nextInt();
                    sc.nextLine();

                    BBM bbm = new BBM(jenisBBM, hargaPerLiter);
                    TransaksiPengisian trx = new TransaksiPengisian(kendaraanDilayani, bbm, jmlLiter, hargaPerLiter);
                    riwayat.enqueue(trx);
                    break;

                case 5:
                    riwayat.getRiwayat();
                    break;

                case 0:
                    System.out.println("Keluar program. Sampai jumpa!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-6.");
            }
        }
    }
}