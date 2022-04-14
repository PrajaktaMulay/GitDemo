import java.util.Scanner;

public class exp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		//pgm1 - add two number
		/*
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.print("Sum "+(a+b));
		*/
		
		//pgm2 multiple two float numbers
		/*
		System.out.println("Enter two float numbers");
		float a = s.nextFloat();
		float b= s.nextFloat();
		System.out.print("Multiplication "+(a*b));
		*/
		
		//pgm3 find ASCII value of a character
		/*
		System.out.println("Enter character");
		char a = 'c';
		int ascii = a;//97
		int asciinumber = (int)a;
		System.out.println(ascii);
		System.out.println(asciinumber);
		*/
		
		//pgm 4 find quotient and reminder
		/*
		System.out.println("Enter character");
		int a = 90;
		int b = 7;
		System.out.println("Q = "+(a/b));
		System.out.println("R = "+(a%b));
		*/
		
		//pgm 5 swap two numbers
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c;
		c=a;
		a=b;
		b=c;
		System.out.print(a+" "+b);
		
	}
	

}
