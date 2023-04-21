package week7;

import java.util.Scanner;

public class Karyawan {
    String nip, nama;
    int status;

    void inputKar() {
        Scanner inp = new Scanner(System.in);
        System.out.println("DATA KARYAWAN");
        System.out.print("Nip\t: ");
        nip = inp.nextLine();
        System.out.print("Nama\t: ");
        nama = inp.nextLine();
        System.out.println("Status Pegawai");
        System.out.println("1. Pegawai Tetap");
        System.out.println("2. Pegawai Kontrak");
        System.out.print("Status Anda (1/2): ");
        status = inp.nextInt();
        System.out.println();

    }
}
