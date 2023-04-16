package week6;

import week6.Transportasi.Mobil;
import week6.Transportasi.Bicycle;

public class TransportasiDemo {
    public static void main(String[] args) {
        Mobil mobilBaru = new Mobil(4, "Offroad", "Toyota");
        mobilBaru.info();

        Bicycle sepedaBaru = new Bicycle(2, "Lipat kecil", "Brompton");
        sepedaBaru.info();
    }
}
