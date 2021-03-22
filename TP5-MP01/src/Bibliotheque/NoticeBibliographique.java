package Bibliotheque;

public class NoticeBibliographique extends Exemplaire {
	private String identifiantSBN;
	private String titre;
	private String sousTitre;
	private Cible cible;

	public boolean estDisponible() {
		return true;
	}

}
