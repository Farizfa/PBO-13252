package week6.Transportasi;

public class Mobil {
    public Mobil(int jumlahRoda, String jenis, String merk) {
        System.out.println("Mobil " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }

    public void info() {
        System.out.println("Mobil dapat membawa banyak barang");
    }
}
