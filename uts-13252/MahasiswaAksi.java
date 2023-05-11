package uts13252;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        // Atribut
        int pilih;
        String cek;
        System.out.print("Masukan jumlah mahasiswa : ");
        int jumlahMahasiswa = input.nextInt();

        do {
            for (int i = 0; i < jumlahMahasiswa; i++) {
                System.out.println("1. Mahasiswa Aktif");
                System.out.println("2. Mahasiswa Baru");
                System.out.println("3. Mahasiswa Transfer");
                System.out.println("4. Mahasiswa Lulus");
                System.out.print("Pilih Kategori : ");
                pilih = input.nextInt();

                switch (pilih) {
                    case 1:
                        MahasiswaAktif mhsAktif = new MahasiswaAktif();
                        System.out.println("Data Mahasiswa ke " + "- " + (i + 1));
                        System.out.print("Nama : ");
                        mhsAktif.nama = input.next();
                        System.out.print("NIM : ");
                        mhsAktif.nim = input.next();
                        System.out.print("Semester : ");
                        mhsAktif.semester = input.nextInt();
                        System.out.print("Usia : ");
                        mhsAktif.usia = input.nextInt();
                        System.out.print("Organisasi : ");
                        mhsAktif.organisasi = input.next();
                        mhsAktif.inputKrs();
                        mhsAktif.hitungRataNilai();
                        daftarMahasiswa.add(mhsAktif);
                        break;
                    case 2:
                        MahasiswaBaru mhsBaru = new MahasiswaBaru();
                        System.out.println("Data Mahasiswa ke " + "- " + (i + 1));
                        System.out.print("Nama : ");
                        mhsBaru.nama = input.next();
                        System.out.print("NIM : ");
                        mhsBaru.nim = input.next();
                        System.out.print("Semester : ");
                        mhsBaru.semester = input.nextInt();
                        System.out.print("Usia : ");
                        mhsBaru.usia = input.nextInt();
                        System.out.print("Asal Sekolah : ");
                        mhsBaru.asalSekolah = input.next();
                        mhsBaru.inputKrs();
                        mhsBaru.hitungRataNilai();
                        daftarMahasiswa.add(mhsBaru);
                        break;
                    case 3:
                        MahasiswaTransfer mhsTransfer = new MahasiswaTransfer();
                        System.out.println("Data Mahasiswa ke " + "- " + (i + 1));
                        System.out.print("Nama : ");
                        mhsTransfer.nama = input.next();
                        System.out.print("NIM : ");
                        mhsTransfer.nim = input.next();
                        System.out.print("Semester : ");
                        mhsTransfer.semester = input.nextInt();
                        System.out.print("Usia : ");
                        mhsTransfer.usia = input.nextInt();
                        System.out.print("Asal Universitas : ");
                        mhsTransfer.asalUniversitas = input.next();
                        mhsTransfer.inputKrs();
                        mhsTransfer.hitungRataNilai();
                        daftarMahasiswa.add(mhsTransfer);
                        break;
                    case 4:
                        MahasiswaLulus mhsLulus = new MahasiswaLulus();
                        System.out.println("Data Mahasiswa ke " + "- " + (i + 1));
                        System.out.print("Nama : ");
                        mhsLulus.nama = input.next();
                        System.out.print("NIM : ");
                        mhsLulus.nim = input.next();
                        System.out.print("Semester : ");
                        mhsLulus.semester = input.nextInt();
                        System.out.print("Usia : ");
                        mhsLulus.usia = input.nextInt();
                        System.out.print("Tahun Masuk : ");
                        mhsLulus.tahunWisuda = input.nextInt();
                        mhsLulus.inputKrs();
                        mhsLulus.hitungRataNilai();
                        daftarMahasiswa.add(mhsLulus);
                        break;
                }
                for (int a = 0; a < daftarMahasiswa.size(); a++) {
                    System.out.println("\nData Mahasiswa ke " + "- " + (a + 1));
                    daftarMahasiswa.get(a).infoMahasiswa();
                    daftarMahasiswa.get(a).infoKrsMahasiswa();
                }
            }
            System.out.print("Input data lagi ? [Y/T] : ");
            cek = input.next();
            System.out.println("");
        } while (cek.equalsIgnoreCase("Y"));
    }
}
