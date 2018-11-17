package Livre;

public class tst_livre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auteur a = new Auteur("Victor","Hugo",1802, true);
		Auteur a1 = new Auteur("Marie","Curie",1867, false);
		System.out.println (a.toString());
		System.out.println (a1.toString());
		Auteur[] a2 = new Auteur[1];
		a2[0] = new Auteur ("Steven M","LaValle",1968,true);
		Livre b1 = new Livre ("Planning Algrithms",a2,2006, "Cambridge University Press",842);
		System.out.println(b1.toString());
		Auteur[] a3 = new Auteur[2];
		a3[0] = new Auteur ("Andreas","Aristidou",0,true);
		a3[1] = new Auteur ("Joan","Lasenby",0,false);
		System.out.println(a3[0].toString());
		System.out.println(a3[1].toString());
		Livre b2 = new Livre ("FABRIK: a fast, iterative solver for the inverse kinematics problem",a3,2011, "Graphical Models",17);
		System.out.println(b2.toString());
		
	}

}
