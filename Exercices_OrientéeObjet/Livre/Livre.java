package Livre;

public class Livre {
	/**Titre du Livre*/
	String titre;
	/**Les Auteurs du Livre*/
	Auteur[] auteurs;
	/**Année de sortie*/
	int anne_de_sortie;
	/**Edition*/
	String edition;
	/**Nombre de Pages*/
	int nbrePage;
	public Livre ()
	{
		
	}
	/**Constructeur
	 * @param T Titre du Livre
	 * @param a les Auteurs du Livre.
	 * @param anne Année de publication.
	 * @param ed Edition 
	 * @param n Nombre de Pages*/
	
	public Livre (String T, Auteur[] a, int anne, String ed,int n)
	{
		this.titre = T;
		this.auteurs = a;
		
		this.anne_de_sortie = anne;
		this.edition=ed;
		this.nbrePage = n;
		
	}
	public Livre (Livre L)
	{
		this.titre = L.titre;
		this.auteurs = L.auteurs;
		this.anne_de_sortie = L.anne_de_sortie;
		this.edition=L.edition;
		this.nbrePage = L.nbrePage;
	}
	public String toString ()
	{
		String a="";
		for (int i =0;i<this.auteurs.length; ++i)
			a+=this.auteurs[i].prenom+". "+this.auteurs[i].nom+", ";
		

		return a+"'"+this.titre+"', "+this.anne_de_sortie+", "+this.edition+", "+this.nbrePage;
	}
	
}
