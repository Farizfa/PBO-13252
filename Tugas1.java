public class Tugas1 {
    public static void main(String[] args) {
        double diameter1 = 10, diameter2 = 5;
        double tinggi1 = 8, tinggi2 = 10;
        double alas = 6;
        double phi = 3.14;
        double jari2 = diameter2 / 2;

        double kell = phi * diameter1;
        double luas = (alas * tinggi1) / 2;
        double volume = phi * jari2 * jari2 * tinggi2;

        System.out.println("a. Hasil Hitung Keliling Lingkaran dengan diameter " + diameter1 + " adalah " + kell);
        System.out.println(
                "b. Hasil Hitung Luas Segitiga dengan alas " + alas + " dan tinggi " + tinggi1 + " adalah " + luas);
        System.out.println("c. Hasil Hitung Volume Tabung dengan diameter " + diameter2 + " dan tinggi " + tinggi2
                + " adalah " + volume);
    }
}
