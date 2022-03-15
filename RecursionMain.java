
public class RecursionMain {
	
	public static void main(String[] args)
	{
		RecursionMain rec = new RecursionMain();
		int result=rec.factorial(-2);
		System.out.println(result);
		
	}
	
	public int factorial(int n)
	{
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

}
