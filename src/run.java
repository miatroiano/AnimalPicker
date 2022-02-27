
import java.util.Scanner;



public class run {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean loop= true;
		
		while (loop == true) {
			System.out.println("Would you like to look at a dog or cat?");
			String animals = scanner.nextLine();
			if (animals.equalsIgnoreCase("dog")) {
				System.out.println("DOG ASCII ART HERE");
				loop = false;
				
			}
			else if(animals.equalsIgnoreCase("cat")) {
				System.out.println("“CAT ASCII ART HERE");
				loop = false;
			}
			else {
				System.out.println("invalid option!");
			}
		}
		
	}
}