import java.util.Scanner;

public class DetikBeraksi {
	public static void main(String args[]) {
		String cek = "Y";
		Scanner inp = new Scanner(System.in);
		Detik detikbaru = new Detik();

		do {
			System.out.print("Input data	: ");
			detikbaru.input = inp.nextInt();
			detikbaru.konversi();
			detikbaru.cetak();

			System.out.print("Input data lagi ? [Y/T] : ");
			cek = inp.next();
			System.out.println("");
		} while (cek.equalsIgnoreCase("Y"));
	}
}