public class Volume {
    public static void main(String[] args) {
        double phi = 3.14;
        double d = 5, t = 10;
        double r = d / 2;

        double hitung = phi * r * r * t;
        System.out
                .println("Hasil Hitung Volume Tabung dengan diameter " + d + " dan tinggi " + t + " adalah " + hitung);
    }
}
