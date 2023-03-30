public class Determinan {
	double a, b, c, x1, x2;
	boolean fCorrect = false, fCorrect1 = false, fCorrect2 = false;

	public Determinan(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		calcX();
	}

	private double calcDiscriminant() {
		return b * b - 4 * a * c;
	}

	private void calcX() {
		double d = calcDiscriminant();
		if (d > 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			fCorrect = true;
		} else if (d == 0) {
			x1 = (-b + Math.sqrt(d)) / (2 * a);
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			fCorrect1 = true;
		} else if (d < 0) {
			x1 = (-b / (2 * a)) + (Math.sqrt(-d) / (2 * a));
			x2 = (-b - Math.sqrt(d)) / (2 * a);
			fCorrect2 = true;
		}
	}

	public boolean isCorrect() {
		return fCorrect;
	}

	public boolean isCorrect1() {
		return fCorrect1;
	}

	public boolean isCorrect2() {
		return fCorrect1;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getX1() {
		return x1;
	}

	public double getX2() {
		return x2;
	}
}
