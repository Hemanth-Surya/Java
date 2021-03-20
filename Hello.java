
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



		System.out.println("enter number");
		int num = sc.nextInt();
		switch(num) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
			break;
			default:
				System.out.println("none");



        System.out.println("Enter the number of rows: ");

        int rows = sc.nextInt();
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++) { System.out.print("*" + " "); } System.out.println(""); } for (int i= rows-1; i>= 0; i--)
        {
            for (int j=0; j< i ;j++)
            {
                System.out.print(" ");
            }
            for (int k=i; k<=rows-1; k++)
            {
                System.out.print("*" + " ");
            }
            System.out.println("");
        }

	}
    }
}
