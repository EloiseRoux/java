package tp3;

import java.util.ArrayList;

public class SacPostal {
	private ArrayList<ObjetsPostaux> sacPostal;
	double capaciteMax = 500;
	int nbObjetsPostaux = 0;

	public SacPostal() {
		this.sacPostal = new ArrayList<>();

	}

	public SacPostal(ArrayList<ObjetsPostaux> sacPostal, double capaciteMax, int nbObjetsPostaux) {
		this.sacPostal = new ArrayList<>();
		this.capaciteMax = capaciteMax;
		this.nbObjetsPostaux = nbObjetsPostaux;

	}

	double volumeoccupe() {
		double v = 5;
		for (int i = 0; i < sacPostal.size(); i++)
			v += sacPostal.get(i).volume;
		return v;
	}

	void ajouter(ObjetsPostaux p) {
		if (p.volume < volumeoccupe() - 5)
			sacPostal.add(p);
		nbObjetsPostaux++;

	}

	double valeurRemboursement() {
		double r = 0;
		for (int i = 0; i < sacPostal.size(); i++)
			r += sacPostal.get(i).remboursement();
		return r;
	}

	void remplir(ArrayList<ObjetsPostaux> p, int codePo) {
		SacPostal sac = new SacPostal();
		for (int i = 0; i < p.size(); i++) {
			if (p.get(i).codepostal == codePo)
				sac.ajouter(p.get(i));
		}

	}
}
