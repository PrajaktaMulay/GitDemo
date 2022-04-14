import java.util.Scanner;

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reverse a string
		//1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String a= sc.next();
		int len = a.length();
		String b = "";
		
		for(int i = len-1;i>=0;i--)
		{
			b = b+a.charAt(i);
		}
		System.out.println(b);
	

	
	//2
	StringBuffer s = new StringBuffer(a);
System.out.println(s.reverse());
	}
}
