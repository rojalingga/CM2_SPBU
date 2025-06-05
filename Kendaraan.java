// Sultan Syarif / SIB 1C / 22

public class Kendaraan {
    String platNomor, tipe, merk;

    public Kendaraan(String platNomor, String tipe, String merk) {
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }

    public void tampil(){
        System.out.println("Plat Nomor : " + platNomor + "\nTipe : " + tipe + " \nMerk : " + merk);
    }
}