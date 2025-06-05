public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter, double harga) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = liter * harga;
    }

    public void tampil() {
        System.out.println(kendaraan.platNomor + " : Rp. " + totalBayar);
    }
}