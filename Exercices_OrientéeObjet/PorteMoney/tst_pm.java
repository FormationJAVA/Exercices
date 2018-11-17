package OOExo;

public class tst_pm {

	public static void main(String[] args) {
			PorteMoney pm = new PorteMoney (2,2,0,1,0,9); // instanciation d'un portemoney
			System.out.println(pm.estVide() ?" le Porte Money est vide" : pm );
			System.out.println( pm.retirer(485)  ? pm : "Impossible de retirer cette somme");
			System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\n");
			PorteMoney pm1=new PorteMoney (0,0,0,0,3,1);// instanciation d'un portemoney
			System.out.println(pm1.estVide()?" le Porte Money est vide" : pm1 );
			System.out.println( pm1.retirer(20) ? pm1 : "Impossible de retirer cette somme" );
	}

}
