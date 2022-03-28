import java.util.Scanner;

public class ROT13
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String userInput;

		System.out.println("========================================\n" +
		"ROT 13 STRING ENCRYPTION/DECRYPTION TOOL\n" +
		"========================================\n");

		System.out.println("Enter a normal string of text to get a encrypted ROT13 string\n" +
		"or enter a ROT13 string to get a decrypted string.\n" +
		"To exit the application, just hit the enter or return key.");

		do{

			System.out.print("\nEnter a string: ");
			userInput = keyboard.nextLine();

			System.out.print("\nROT13 shifted string: ");
			for(int i = 0; i < userInput.length(); i++)
			{
				char x = userInput.charAt(i);

				if(x >= 'a' && x <= 'm' || x >= 'A' && x <= 'M')
				{
					x += 13;
				}
				else if(x >= 'n' && x <= 'z' || x >= 'N' && x <= 'Z')
				{
					x -= 13;
				}

				System.out.print(x);
			}

			System.out.println("\n");

		}while(!userInput.equalsIgnoreCase(""));

	}
}