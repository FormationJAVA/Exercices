package Basic;

public class ex5 {

	public static void main(String[] args) {

		int n=57;
		String m = String.valueOf(n);
		m += isPrime(n) ? " est un nombre Premier" : " n'est pas un nombre Premier";
		System.out.println(m); 
		if (!isPrime(n))
		{
			for (int i=0;i<n;i++)
			{
				if (isPrime(i))
					System.out.print(i+" ");
			}
			System.out.println("");
		}


	}
	public static boolean isPrime(int n)
	{
		if (n==0) return false;
		if (n==2) return true;
		if (n%2==0) return false;
		for (int i=3;i<=Math.sqrt(n);i+=2)
		{

			if (n%i==0)
				return false;
		}
		return true;
	}

}
