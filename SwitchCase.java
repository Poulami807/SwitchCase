package Assignment;
import java.util.Scanner;
public class SwitchCase {

	public static void main(String[] args) {
		int choice;
		System.out.println("Pick one: 1. Hi\t2. Hey\t3. Hello\t");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		sc.close();
		switch(choice)
		{
		case 1: 
			    System.out.println("You said Hi!");
			    break;
		case 2: 
		        System.out.println("You said Hey!");
		        break;
		case 3: 
		        System.out.println("You said Hello!");
		        break;
		default: 
			    System.out.println("Invalid choice");

		}
	}
}
