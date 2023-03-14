//Program 6.1 overload function.java
class overloadex
{
	void ex()
	{
		System.out.println("no parameters");
	}
	void ex(int a)
	{
		System.out.println("one parameter" +a);
	}
	void ex(int a,int b)
	{
		System.out.println("two parameter" +a+" "+b);
	}
	double ex(double a)
	{
		System.out.println("double paramete "+a);
		return(a);
	}
}

public class overload
{
	public static void main(String args[])
	{
		overloadex ovrload=new overloadex();
		double result;
		ovrload.ex();
		ovrload.ex(1);
		ovrload.ex(1,2);
		result=ovrload.ex(1.52);
		System.out.println(result);
	}
}

Output:-
no parameters
one parameter1
two parameter1 2
double paramete 1.52
1.52
