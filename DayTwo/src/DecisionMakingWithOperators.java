import java.util.Scanner;

public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>=y) {
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
		if((a<b)||(a==b)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");       
		}
	}
}