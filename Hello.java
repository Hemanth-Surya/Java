
class Calc
{
	int num1;
	int num2;
	int result;

	public void perform()
	{
		result = num1 + num2;
	}
}

	public class Hello
	{
		public static void main(String[] args)
		{
			Calc obj = new Calc();
			obj.num1 = 4;
			obj.num2 = 6;
			obj.perform();
			System.out.println(obj.result);
		}
	}
