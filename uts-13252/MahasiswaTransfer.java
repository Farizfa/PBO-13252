package uts13252;

public class MahasiswaTransfer extends MahasiswaBaru {
    // Atribut
    String asalUniversitas;

    // Method
    @Override
    public boolean ikutOspek() {
        return super.ikutOspek();
    }

    @Override
    public void infoMahasiswa() {
        System.out.println("Asal Universitas : " + this.asalUniversitas);
        super.infoMahasiswa();
    }
}
