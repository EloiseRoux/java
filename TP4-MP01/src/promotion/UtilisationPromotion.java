package promotion;

public class UtilisationPromotion {

	public static void main(String[] args) {
		Promotion p = new Promotion(2017);
		Etudiant e1 = new Etudiant("Alan", 19, 2001, CodePays.ENF, 9, 9, 10);
		Etudiant e2 = new Etudiant("Eloise", 18, 2002, CodePays.E, 17, 11, 11);
		Etudiant e3 = new Etudiant("Lea", 17, 2003, CodePays.ENF, 11, 11, 11);
		Etudiant e4 = new Etudiant("Martin", 20, 2000, CodePays.F, 12, 17, 15);
		p.inscrire(e1);
		p.inscrire(e2);
		p.inscrire(e3);
		p.inscrire(e4);
		System.out.println(p.nouveauxInscritsNonFrancophones().size());
		System.out.println(p.majors());
		p.afficheresultat();
	}

}
