package Basic;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factoriel(5));
	}
	public static double Factoriel (int n)
	{
		if (n==0) return 1;
		
		return n*Factoriel (n-1);
	}
}
