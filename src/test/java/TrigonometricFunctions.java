
public class TrigonometricFunctions
{
	public static final double pi = 3.141592;			
	public static final double angleOfCircle = 360;		
	
	
		public static double DgToRd (double x)
	{
		return (2* x * pi)/ angleOfCircle ;
	}

	public static double normalRd (double x)
	{
		return x % (pi*2);
	}

	public static double sin(double angle) throws PowerException, FactorialException
	{
		double sin1=0;
		double normalAgg = normalRd(angle);
		
		for(int z=1;z<=11;z++)
		{
			sin1 = sin1 + (power(-1, z-1)*
					power(normalAgg, (2*z)-1)/fact((2*z)-1));
		}
		
		return sin1;
	}
	

	public static double cos(double angle) throws PowerException, FactorialException
	{
		double cos1=0;
		double normalAgg = normalRd(angle);
				
		for(int z=1;z<=11;z++)
		{
			cos1 = cos1 + (power(-1, z-1)*
					power(normalAgg, 2*(z-1))/fact(2*(z-1)));
		}
		
		return cos1;
	}

	public static double tan(double angle) throws PowerException, FactorialException
	{
		double tan1=0;
		
		tan1 = sin(angle) / cos (angle);
		
		return tan1;
	}

	public static long fact(int a) throws FactorialException
	{
		long mul=1;
		
		if(a >=0)
		{
			for(int z=1; z<=a; z++)
			{
				mul = mul*z;
			}
		}
		else
			throw new FactorialException("Invaild number to find factorial!");
		
		return mul;
	}
	
	public static double power(double f, int g) throws PowerException
	{
		double value=1;
		
		if(g == 0)
			return value;
		
		if (g<0)
			throw new PowerException("Can not Compute the Negative Power!");
		
		for(int z=1; z<=g; z++)
			value = value * f;
		
		return value;
		
	}
}