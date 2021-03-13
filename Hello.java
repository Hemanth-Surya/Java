import java.util.Scanner;
public class Hello {
	public static void main(String[] args) {
		int num1,num2,sum,product,diff,div,mod;
		Scanner sc = new Scanner(System.in);
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
	}
}
