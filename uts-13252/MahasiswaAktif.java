package uts13252;

public class MahasiswaAktif extends Mahasiswa {
    // Atribut
    String organisasi;

    // Method
    @Override
    public void infoMahasiswa() {
        System.out.println("Organisasi : " + this.organisasi);
        super.infoMahasiswa();
    }
}
