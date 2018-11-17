package Basic;

public class ex3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Fibonacci - Boucle");
		Fibonacci (n);
		System.out.println("Fibonacci - Recursivité");
		for (int i =0;i<=n;i++)
		{
			System.out.println(U (i));
		}
	}
	public static void Fibonacci (int n)
	{
		int u1=1,u2=1,u3;
		for (int i =0;i<=n;i++)
		{
			if (i==0)
			{
				System.out.println(u1);
				
			}
			else
			{
				if ( i==1)
				{
					System.out.println(u2);
				}
				else
				{
					u3 = u1+u2;
					System.out.println(u3);
					u1=u2;
					u2=u3;
					
				}
			}
		}
	}
	public static int U(int n)
	{
		if (n==0 || n==1)
		{
			return 1;
		}
		return U(n-1)+U(n-2);
	}
}
