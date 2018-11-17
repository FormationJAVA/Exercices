package porte;

public class PorteClassic extends Porte {
	public boolean porteDouble;
	public float ouverture;
	
	public PorteClassic (Dimension D1,Dimension D2,boolean pDouble,float o )
	{
		super( D1, D2);
		this.porteDouble = pDouble;
		this.ouverture = o;
	}
	public PorteClassic (PorteClassic pc )
	{
		super( pc.PorteDim, pc.CadreDim);
		this.porteDouble = pc.porteDouble;
		this.ouverture = pc.ouverture;
	}
	public boolean estOuvert ()
	{
		return this.ouverture > 0 ? true : false;
	}
	public String toString ()
	{
		String s = "Porte Classique\n";
		s+="Dimension Porte : "+ PorteDim.toString()+"\n";
		s+="Dimension Cadre : "+ CadreDim.toString()+"\n";
		s+= this.estOuvert() ? "Porte Ouverte\n" : "Porte Fermée\n";
		s+= this.porteDouble ? "Porte Double\n" : "Porte simple\n";
		return s;
	}
	public void Ouvrir()
	{
		this.ouverture = (float)Math.PI/2.0f;
	}
}
