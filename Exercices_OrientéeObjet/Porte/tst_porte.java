package porte;

public class tst_porte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension D1 = new Dimension (70,4,220);
		Dimension D2 = new Dimension (75,10,225);
		
		PorteClassic pc = new PorteClassic(D1,D2,true,0.0f);
		System.out.println(pc.PorteDim.toString());
		System.out.println(pc.CadreDim.toString());
		System.out.println(pc.estOuvert());
		System.out.println(pc.toString());
		pc.Ouvrir();
		System.out.println(pc.toString());
	}

}
