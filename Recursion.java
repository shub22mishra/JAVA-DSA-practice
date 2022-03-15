
public class Recursion {

	public static void main(String[] args) {
		
		Recursion re=new Recursion();
		int result= re.fibonacci(7);
		System.out.println(result);
		

	}	
	
	public int fibonacci(int n) {
		if(n<0)
		{
			return -1;
		}
		if(n==0 || n==1)
		{
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}

}
