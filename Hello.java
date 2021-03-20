import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {


		System.out.println("hello Hemanth Surya");

		int num1,num2,sum,product,diff,div,mod;

		Scanner sc = new Scanner(System.in);
		int num3;
		System.out.println("enter first number");
		num1 = sc.nextInt();
		System.out.println("enter second number");
		num2 = sc.nextInt();

		sum = num1+num2;
		product = num1*num2;
		diff = num1-num2;
		div = num1/num2;
		mod = num1%num2;
		System.out.println( "sum is"  +sum+   "product is"  +product+  "diff is"  +diff+   "div is"  +div+  "mod is"+mod );

		System.out.println("enter third number");
		num3 = sc.nextInt();
		if(num1 > num2 && num1 >num3)
			System.out.println("num1 is greater");
		else if(num2 > num1 && num2 > num3)
			System.out.println("num2 is greater");
		else
			System.out.println("num3 is greater");


	}
}
