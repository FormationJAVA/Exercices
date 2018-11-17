package porte;

public class PorteRideau extends Porte {
	
	public float ouverture;

	public PorteRideau (Dimension D1,Dimension D2,float o )
		{
			super( D1, D2);

			this.ouverture = o < D1.Hauteur ? o : D1.Hauteur;
		}
		public PorteRideau (PorteRideau pc )
		{
			super( pc.PorteDim, pc.CadreDim);

			this.ouverture =  pc.ouverture < this.PorteDim.Hauteur ? pc.ouverture : this.PorteDim.Hauteur;
		}
		public boolean estOuvert ()
		{
			return this.ouverture > 0 ? true : false;
		}
	
}
