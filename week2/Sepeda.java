public class Sepeda {
    // atribut (state & behavior)
    int gear = 5;

    // method (operasi)
    void ngerem() {
        System.out.println("Sepeda direm");
    }

    // constructor
    Sepeda(int jumlahRoda, String jenis, String merk) {
        System.out.println("Sepeda " + jenis + " bermerk " + merk + " memiliki jumlah roda " + jumlahRoda);
    }
}
