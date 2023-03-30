public class Detik {
	int input, hari, jam, menit, detik;

	public Detik(int input) {
		this.input = input;
	}

	public Detik() {
	}

	void konversi() {
		hari = input / 86400;
		jam = (input % 86400) / 3600;
		menit = ((input % 86400) % 3600) / 60;
		detik = ((input % 86400) % 3600) % 60;
	}

	void cetak() {
		System.out.println("Hari		: " + hari);
		System.out.println("Jam		: " + jam);
		System.out.println("Menit		: " + menit);
		System.out.println("Detik		: " + detik);
		System.out.println("");
	}
}