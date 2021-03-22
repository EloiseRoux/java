package promotion;

import java.util.ArrayList;

public class Promotion {
	public Promotion() {
		int annee = 2020;
		this.etudiants = new ArrayList<>();

	};

	public Promotion(int annee) {
		this.etudiants = new ArrayList<>();
		this.annee = annee;

	};

	private ArrayList<Etudiant> etudiants;

	private int annee;

	public int getAnnee() {
		return annee;
	};

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public ArrayList<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(ArrayList<Etudiant> etudiants) {
		this.etudiants = etudiants;

	};

	public Etudiant iemeEtu(int i) {
		if (i >= 0 && i < this.etudiants.size())
			return this.etudiants.get(i);
		else
			return null;
	}

	public int nbEtu() {
		return this.etudiants.size();
	}

	public void inscrire(Etudiant etu) {
		if (this.etudiants.contains(etu))
			System.out.println("étudiant déjà présent");
		else
			this.etudiants.add(etu);
	}

	public double moyenneGenerale() {
		float m = 0;
		for (int i = 0; i < this.nbEtu(); i++)
			m += iemeEtu(i).calculmoyenne();
		return m / (this.nbEtu());

	}

	public void afficheresultat() {
		for (int i = 0; i < this.nbEtu(); i++)
			iemeEtu(i).ligneResultats();

	}

	public void recherche(String s) {
		int i = 0;
		int j = 0;
		while (i <= 1 || j > nbEtu() - 1) {

			if (iemeEtu(j).getNom().equals(s)) {
				iemeEtu(j).ligneResultats();
				i++;
			}
			j++;
			if (j >= nbEtu()) {
				System.out.println("pas de résultat");
			}
		}
	}

	public ArrayList<Etudiant> admis() {
		ArrayList<Etudiant> v = new ArrayList<>();
		for (int i = 0; i < nbEtu(); i++) {
			if (iemeEtu(i).calculmoyenne() >= 10)
				v.add(iemeEtu(i));
		}
		return v;
	}

	public ArrayList<Etudiant> nouveauxInscritsNonFrancophones() {
		ArrayList<Etudiant> v = new ArrayList<>();
		for (int i = 0; i < nbEtu(); i++) {
			if (iemeEtu(i).getCodePays() == CodePays.ENF)
				v.add(iemeEtu(i));
		}
		return v;
	}

	public ArrayList<Etudiant> majors() {
		double r = iemeEtu(0).calculmoyenne();
		ArrayList<Etudiant> v = new ArrayList<>();
		for (int i = 1; i < nbEtu(); i++)

		{
			int j = 0;
			if (iemeEtu(i).calculmoyenne() == r)
				v.add(iemeEtu(i));
			else {
				if (iemeEtu(i).calculmoyenne() > r) {
					v.clear();
					r = iemeEtu(i).calculmoyenne();
					v.add(iemeEtu(i));
					j = i;
				}
			}
		}

		return v;
	}
}
