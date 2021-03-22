package tp3;

public class test {
	public static void main(String[] args) {
		Colis c1 = new Colis("France", "Laponie", 90800, 1, 3, Taux.Neutre, "cadeaux", 3556f);
		Colis c2 = new Colis(null, null, 0, 0, 0, null, null, 0);

		double r = c1.remboursement();

		System.out.println(c1.remboursement());
		System.out.println(c1.affranchissement());

	}

}
