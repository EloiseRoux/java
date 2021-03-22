package tp3;

import java.time.LocalDateTime;

public class ColisExpress extends Colis {

	private static int nombreColisExpress;
	private boolean emballage;
	private int suivi;
	private LocalDateTime dateEnvoi;

	public ColisExpress(String origine, String destination, int codepostal, float poids, float volume,
			Taux recommandation, String contenu, float valeur, boolean emballage, int suivi) {
		super(origine, destination, codepostal, poids, volume, recommandation, contenu, valeur);
		suivi = nombreColisExpress;
		setDateEnvoi(LocalDateTime.now());
		nombreColisExpress++;
	}

	public static int getNombreColisExpress() {
		return nombreColisExpress;
	}

	public static void setNombreColisExpress(int nombreColisExpress) {
		ColisExpress.nombreColisExpress = nombreColisExpress;
	}

	public boolean isEmballage() {
		return emballage;
	}

	public void setEmballage(boolean emballage) {
		this.emballage = emballage;
	}

	public int getSuivi() {
		return suivi;
	}

	public void setSuivi(int suivi) {
		this.suivi = suivi;
	}

	@Override
	public void setPoids(float poids) {
		if (poids < 30)
			super.setPoids(poids);
	}

	public double affranchissement() {
		double r = 30;
		if (emballage)
			r += 3;
		return r;
	}

	// Colis Express code postal/destination/taux de recommandation/volume/valeur
	// declaree/poids/numerodesuivi

	public String description() {
		String d;
		d = "ColisExpress/" + String.valueOf(codepostal) + "/" + destination + "/" + String.valueOf(recommandation)
				+ "/" + String.valueOf(volume) + "/" + String.valueOf(getValeur()) + "/" + String.valueOf(getPoids())
				+ "/" + String.valueOf(suivi);

		return d;
	}

	public LocalDateTime getDateEnvoi() {
		return dateEnvoi;
	}

	public void setDateEnvoi(LocalDateTime dateEnvoi) {
		this.dateEnvoi = dateEnvoi;
	}
}
