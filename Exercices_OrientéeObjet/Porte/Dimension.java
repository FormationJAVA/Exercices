package porte;

public class Dimension {
	public float Largeur;
	public float Profondeur;
	public float Hauteur;
	
	public Dimension (){
		this.Profondeur = 0;
		this.Largeur = 0;
		this.Hauteur = 0;
	}
	public Dimension (int W,int P, int H){
		this.Profondeur = P;
		this.Largeur = W;
		this.Hauteur = H;
	}
	public Dimension (Dimension D){
		this.Profondeur = D.Profondeur ;
		this.Largeur = D.Largeur ;
		this.Hauteur = D.Hauteur;
	}
	public String toString ()
	{
		return this.Largeur+" x "+this.Profondeur+" x "+this.Hauteur;
	}
}
