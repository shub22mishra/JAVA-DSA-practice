
public class Fibonacci {

	public static void main(String[] args) {
	Fibonacci fb= new Fibonacci();
	int res=fb.fibo(6);
	System.out.println(res);

	}
	
	public int fibo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		if(n<0)
		{
			return -1;
		}
		return fibo(n-2) + fibo(n-1);
	}
	

}
