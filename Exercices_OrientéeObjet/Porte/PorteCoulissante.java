package porte;

public class PorteCoulissante extends Porte {
	public float ouverture;
	
	public PorteCoulissante (Dimension D1,Dimension D2,float o )
	{
		super( D1, D2);
		//this.porteDouble = pDouble;
		this.ouverture = o < D1.Largeur ? o : D1.Largeur;
	}
	public PorteCoulissante (PorteCoulissante pc )
	{
		super( pc.PorteDim, pc.CadreDim);
		//this.porteDouble = pc.porteDouble;
		this.ouverture = pc.ouverture < this.PorteDim.Largeur ? pc.ouverture : this.PorteDim.Largeur;
	}
	public boolean estOuvert ()
	{
		return this.ouverture > 0 ? true : false;
	}
}
