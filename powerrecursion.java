
public class powerrecursion {
	
	
	public static void main(String args[])
	{
	powerrecursion re=new powerrecursion();
	int result=re.power(5,2);
	System.out.println(result);

	}
	
	
	public int power(int base,int exp)
	{
		if(exp<0)
		{
			return -1;
		}
		if(exp==0)
		{
			return 1;
		}
		
		
		
		return base *power(base,exp-1);
	}
}

