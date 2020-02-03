import java.util.Scanner;

public class HelloName
	{
	public static void main(String[] args) 
		{
		Scanner	userStringInput = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = userStringInput.nextLine();
		System.out.println("What is your favorite book?");
		String book = userStringInput.nextLine();
		}

	}
