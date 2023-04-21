package week7;

import java.text.DecimalFormat;

public class KaryawanBeraksi {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##,###,##0.00");
        Karyawan kar = new Karyawan();
        KaryawanTetap tetap = new KaryawanTetap();
        KaryawanKontrak kontrak = new KaryawanKontrak();

        kar.inputKar();
        if (kar.status == 1) {
            tetap.inputTetap();
            System.out.println("Gaji diterima\t: " + df.format(tetap.totalGaji()));
        } else if (kar.status == 2) {
            kontrak.inputKontrak();
            System.out.println("Upah diterima\t: " + df.format(kontrak.totalUpah()));
        } else {
            System.out.println("Status Karyawan Tidak Ditemukan");
        }
        System.out.println();
    }
}
