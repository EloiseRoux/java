package tp3;

public class Colis extends ObjetsPostaux {

	public Colis(String origine, String destination, int codepostal, float poids, float volume, Taux recommandation,
			String contenu, float valeur) {
		super(origine, destination, codepostal, poids, volume, recommandation);

	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}

	private String contenu;
	private float valeur;

	public double affranchissement() {
		double r = 2;
		if (recommandation == Taux.Neutre)
			r += 0.5;
		if (recommandation == Taux.Recommande)
			r += 1.5;
		return r;
	}

	public double remboursement() {
		double r = 0.0;
		if (recommandation == Taux.Neutre)
			r = 0.1f * this.valeur;
		if (recommandation == Taux.Recommande)
			r = 0.5f * this.valeur;

		return r;

	}

	// Colis code postal/destination/taux de recommandation/volume/valeur declaree
	public String description() {
		String d;
		d = "Colis/" + String.valueOf(codepostal) + "/" + destination + "/" + String.valueOf(recommandation) + "/"
				+ String.valueOf(volume) + "/" + String.valueOf(valeur);

		return d;
	}
}
