public class Lampu {
    // Atribut
    boolean nyala;

    // Method
    void nyalakanLampu() {
        nyala = true;
        System.out.println("Apakah lampu menyala? " + nyala);
    }

    void matikanlampu() {
        nyala = false;
        System.out.println("Apakah lampu menyala? " + nyala);
    }
}
