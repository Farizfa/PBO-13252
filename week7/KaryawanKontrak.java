package week7;

import java.util.Scanner;

public class KaryawanKontrak extends Karyawan {
    double uphHarian;
    int jmlAnak, hrMasuk;

    void inputKontrak() {
        Scanner inp = new Scanner(System.in);
        System.out.println("---Karyawan Kontrak---");
        System.out.print("Upah Harian\t: ");
        uphHarian = inp.nextDouble();
        System.out.print("Jumlah Masuk\t: ");
        hrMasuk = inp.nextInt();
        System.out.print("Jumlah Anak\t: ");
        jmlAnak = inp.nextInt();
    }

    double totalUpah() {
        return (hrMasuk * uphHarian) + (jmlAnak * (0.1 * (hrMasuk * uphHarian)));
    }
}
