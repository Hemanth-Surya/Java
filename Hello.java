import java.util.Scanner;
public class Hello
{
	public static void main(String[] args)
	{
		double num1,num2,result;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the op you want: +, -, *, /");
		op = sc.next().charAt(0);
		System.out.println("enter num1");
		num1 = sc.nextDouble();
		System.out.println("enter num2");
		num2 = sc.nextDouble();

		switch(op)
		{
			case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;

			case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 +  "=" + result);
			break;

			case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;

			case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;

			default:
			System.out.println("invalid");
		}
	}
}
