package test;

import etudiant.Etudiant;

public class Etu {
	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		e1.setAge(19);
		e1.setDateNaissance(2001);
		e1.setNom("Alan");
		e1.setNote1(20);
		e1.setNote2(18);
		e1.setNote3(19);
		e1.calculmoyenne();
		e1.calculmention(e1.calculmoyenne());
		e1.ligneResultats(e1.calculmoyenne(), e1.calculmention(e1.calculmoyenne()));
		System.out.println(e1.toString());
	}
}
