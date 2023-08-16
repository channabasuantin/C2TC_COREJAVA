import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("the largest numbedr is");
		if(a>b) {
			if(a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else
		{
			if(b>c)
				System.out.println(b);
			else
				System.out.println(c);
		}
		
	}

}
