
class Calc
{
	int num1;
	int num2;

	public Calc()
	{
		num1 = 4;
		num2 = 5;
	}

	public Calc(int n)
	{
		num1 = n;
		num2 = n;
	}

	public Calc(double d, int n)
	{
		num1 = (int) d;
		num2  = n;
	}
}

	public class Hello
	{
		public static void main(String[] args)
		{
			Calc obj = new Calc(100);
			System.out.println(obj.num2);
		}
	}
