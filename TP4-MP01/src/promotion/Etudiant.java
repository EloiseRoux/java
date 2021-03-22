package promotion;

public class Etudiant {

	private String nom;
	private int age;
	private int dateNaissance;
	private CodePays codePays;
	private float note1;
	private float note2;
	private float note3;

	public Etudiant(String nom, int age, int dateNaissance, CodePays codePays, int note1, int note2, int note3) {
		this.nom = nom;
		this.age = age;
		this.dateNaissance = dateNaissance;
		this.codePays = codePays;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;

	}

	public String toString() {
		return "nom: " + this.nom + " ,�ge: " + this.age + ", ann�e de naissance: " + this.dateNaissance + ", moyenne:"
				+ this.calculmoyenne();

	}

	public void of(int year, int month, int dayOfMonth) {
	}

	public void setNom(String nom) {
		this.nom = nom;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDateNaissance(int dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public float getNote1() {
		return note1;
	}

	public void setNote1(int note1) {
		this.note1 = note1;
	}

	public void setNote2(int note2) {
		this.note2 = note2;
	}

	public void setNote3(int note3) {
		this.note3 = note3;
	}

	public float getNote2() {
		return note2;
	}

	public float getNote3() {
		return note3;
	}

	public String getNom() {
		return nom;

	}

	public float calculmoyenne() {
		return (getNote1() + getNote2() + getNote3()) / 3;
	}

	public String calculmention() {
		String s = null;
		if (calculmoyenne() >= 10)
			s = "passage";
		if (calculmoyenne() >= 12)
			s = "assez bien";
		if (calculmoyenne() >= 14)
			s = "bien";
		if (calculmoyenne() >= 16)
			s = ("Tres bien");

		if (calculmoyenne() < 10)
			s = "nonAdmis";
		return s;
	}

	public String ligneResultats() {
		String r = (getNom() + " " + calculmoyenne() + " " + calculmention() + " ");
		if (calculmoyenne() < 10) {
			if (getNote1() >= 10)
				r += +getNote1() + " ";
			if (getNote2() >= 10)
				r += +getNote2() + " ";
			if (getNote3() >= 10)
				r += +getNote3() + " ";
		}
		System.out.println("resultats= " + r);
		return r;

	}

	public CodePays getCodePays() {
		return codePays;
	}

	public void setCodePays(CodePays codePays) {
		this.codePays = codePays;
	}
}
