package week10.phone;

public class CellphoneMain {
    public static void main(String[] args) {
        Cellphone cp = new Cellphone("Samsung", "S23");
        cp.powerOn(); // fitur menyalakan hp
        cp.chargeBattery(80); // fitur charging hp
        cp.displayInfo(); // melihat informasi hp
        cp.addContact("Aditya", "081578316997"); // menambahkan kontak
        cp.addContact("Rizqi", "081212357894");
        cp.displayContacts(); // melihat kontak
        cp.topUpPulsa(50000); // fitur top up pulsa
        System.out.println("Sisa pulsa: " + cp.checkPulsa()); // melihat sisa pulsa
        cp.searchContact("Aditya"); // mencari kontak
        cp.searchContact("Rizqi");
        cp.removeContact("Aditya"); // menghapus kontak
        cp.displayContacts();
        cp.powerOff(); // mematikan hp
    }
}
