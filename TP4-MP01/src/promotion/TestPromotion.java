package promotion;

public class TestPromotion {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant("Alan", 19, 2001, CodePays.ENF, 9, 9, 10);
		Etudiant e2 = new Etudiant("Eloise", 18, 2002, CodePays.E, 17, 11, 11);
		Etudiant e3 = new Etudiant("Lea", 17, 2003, CodePays.F, 11, 11, 11);
		Etudiant e4 = new Etudiant("Martin", 20, 2000, CodePays.F, 12, 17, 15);
		Promotion p1 = new Promotion(2018);
		p1.inscrire(e1);
		p1.inscrire(e2);
		p1.inscrire(e3);
		p1.inscrire(e4);
		// System.out.println(p1.nbEtu());
		// System.out.println(p1.iemeEtu(0));
		// System.out.println(p1.moyenneGenerale());
		// p1.afficheresultat();
		System.out.println(p1.majors());

	}

}
