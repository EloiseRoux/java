package tp3;

public abstract class ObjetsPostaux {
	private String origine;
	protected String destination;
	protected int codepostal;
	private float poids;
	protected float volume;
	protected Taux recommandation;

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public ObjetsPostaux(String origine, String destination, int codepostal, float poids, float volume,
			Taux recommandation) {
		this.origine = origine;
		this.destination = destination;
		this.codepostal = codepostal;
		this.setPoids(poids);
		this.volume = volume;
		this.recommandation = recommandation;

	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

	public abstract double remboursement();
}
