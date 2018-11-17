package Basic;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 5.3f;
		float b = 7.8f;
		float c = -3.2f;
		System.out.println(min(a,b));
		System.out.println(min(a,c));
		
		System.out.println(max(a,b));
		System.out.println(max(a,c));
		
		System.out.println(min(a,b,c));
		System.out.println(max(a,b,c));
	}
	public static float min(float a, float b)
	{
		return a < b ? a: b;
	}
	public static float max(float a, float b)
	{
		return a > b ? a: b;
	}
	public static float min(float a, float b, float c)
	{
		return min( min(a,b) , c);
	}
	public static float max(float a, float b, float c)
	{
		return max( max(a,b) , c);
	}
}
