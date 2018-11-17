package Basic;

public class ex2 {
	//Les variables a, b sont des variables globales Accessible à toutes 
	//les méthodes dans la class ex2
	static int a=3;
	static int b = 2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		swap();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
	}
	/**
	 * Méthode qui echange les valeurs de deux variables a,b 
	 */
	public static void swap()
	{
		int t =b;
		b=a;
		a=t;
	}
}
