package porte;

public class Porte {
	Dimension PorteDim;
	Dimension CadreDim;
	
	public Porte ()
	{
		
	}
	public Porte (Dimension D1,Dimension D2)
	{
		this.PorteDim = D1;
		this.CadreDim = D2;
	}
	public Porte (Porte P)
	{
		this.PorteDim = P.PorteDim;
		this.CadreDim = P.CadreDim;
	}
	public String toString ()
	{
		String s = "";
		s= PorteDim.toString()+"\n";
		s+= CadreDim.toString()+"\n";
		
		return s;
	}

}
