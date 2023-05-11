package uts13252;

public class MahasiswaBaru extends Mahasiswa {
    // Atribut
    String asalSekolah;

    // Method
    public boolean ikutOspek() {
        if (semester == 1) {
            System.out.print("Wajib Mengikuti Ospek ");
            return true;
        } else {
            System.out.print("Sudah Mengikuti Ospek ");
            return false;
        }
    }

    @Override
    public void infoMahasiswa() {
        System.out.println("Asal Sekolah : " + this.asalSekolah);
        super.infoMahasiswa();
    }
}
