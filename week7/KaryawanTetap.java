package week7;

import java.util.Scanner;

public class KaryawanTetap extends Karyawan {
    double gaji;
    int jmlAnak;

    void inputTetap() {
        Scanner inp = new Scanner(System.in);

        System.out.println("---Karyawan Tetap---");
        System.out.print("Gaji Pokok\t: ");
        gaji = inp.nextDouble();
        System.out.print("Jumlah anak\t: ");
        jmlAnak = inp.nextInt();
    }

    double totalGaji() {
        return gaji + (jmlAnak * (0.1 * gaji));
    }

}
