package Livre;

public class Auteur {
	/**Nom de l'auteur.*/
	public String nom;
	/**Pénom de l'auteur.*/
	public String prenom;
	/**Année de naissance de l'auteur.*/
	public int anne;
	/** Genre de l'auteur*/
	public boolean homme;
	
	public Auteur ()
	{
		
	}
	/**Constructeur Auteur
	 * @param firstname prenom de l'auteur.
	 * @param familyname nom del'auteur.
	 * @param anne Année de naissance de l'auteur.
	 * @param h true si l'auteur st un homme false si l'auteur est une femme.*/
	public Auteur (String firstname,String familyname,int anne, boolean h)
	{
		this.nom = familyname;
		this.prenom = firstname;
		this.anne = anne;
		this.homme = h;
		
	}
	public Auteur (Auteur a)
	{
		this.nom = a.nom;
		this.prenom = a.prenom;
		this.anne = a.anne;
		this.homme = a.homme;
	}
	
	public String toString()
	{
		
		return (this.prenom + ", " + this.nom + (this.anne>0 ? (homme ? " né en " :" née en " ) + this.anne:""));
	}

}
