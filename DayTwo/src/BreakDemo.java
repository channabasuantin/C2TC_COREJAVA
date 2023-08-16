import java.util.Scanner;
import java.util.*;
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int ch=sc.nextInt();
		switch(ch) {
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		default:System.out.println("plz enter the valid choice");
		}

	}

}
