package week5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MahasiswaAksi {
    public static void main(String[] args) {
        int semester;
        String nama, nim, cek;
        Scanner inp = new Scanner(System.in);

        // membuat objek ArrayList untuk menyimpan data mahasiswa
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();
        do {
            // menambahkan data mahasiswa ke dalam ArrayList
            ArrayList<Double> nilaibaru = new ArrayList<Double>();
            System.out.println("Input Data Mahasiswa");
            System.out.print("Nama    : ");
            nama = inp.nextLine();
            System.out.print("NIM     : ");
            nim = inp.nextLine();
            System.out.print("Semester: ");
            semester = inp.nextInt();
            for (int i = 0; i < semester; i++) {
                System.out.print("IP Smt " + (i + 1) + " : ");
                nilaibaru.add(inp.nextDouble());
            }
            mahasiswaList.add(new Mahasiswa(nama, nim, nilaibaru));
            System.out.println("");

            System.out.print("Input data lagi ? [Y/T] : ");
            cek = inp.next();
            System.out.println("");
        } while (cek.equalsIgnoreCase("Y"));

        // menampilkan data mahasiswa dan IPK menggunakan Iterator
        System.out.println("DATA IPK MAHASISWA");
        Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
        while (iterator.hasNext()) {
            Mahasiswa mahasiswa = iterator.next();
            System.out.println("Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPK: "
                    + mahasiswa.hitungIPK());
        }
        System.out.println("");
    };

}
