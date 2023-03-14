public class AksiSepeda {
    public static void main(String[] args) {
        // objek
        Sepeda sepedaLipat = new Sepeda(2, "Sepeda Lipat kecil", "Brompton");

        // atribut dan method
        int gearSepeda = sepedaLipat.gear;
        System.out.println("Jumlah gear " + gearSepeda);
        sepedaLipat.ngerem();
    }
}
