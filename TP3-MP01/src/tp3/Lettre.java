package tp3;

public class Lettre extends ObjetsPostaux {
	public Lettre(String origine, String destination, int codepostal, float poids, float volume, Taux recommandation,
			boolean urgent) {
		super(origine, destination, codepostal, poids, volume, recommandation);

	}

	private boolean urgent;

	public double affranchissement() {
		double r = 0.5;
		if (recommandation == Taux.values()[1])
			r += 0.5;
		if (recommandation == Taux.Recommande)
			r += 1.5;
		if (urgent)
			r += 0.3;
		return r;

	}

	public double remboursement() {
		double r = 0;
		if (recommandation == Taux.values()[1])
			r = 1.5;
		if (recommandation == Taux.values()[1])
			r = 15;
		return r;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}
	// Lettre code postal/destination/taux de recommandation/caractere d'urgence

	public String description() {
		String d;
		d = "Lettre/" + "/" + String.valueOf(codepostal) + "/" + destination + "/" + String.valueOf(recommandation)
				+ "/" + String.valueOf(urgent);

		return d;

	}
}