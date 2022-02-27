
import java.util.Scanner;



public class run {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Boolean loop= true;
		
		while (loop == true) {
			System.out.println("Would you like to look at a Dog, Fish, or Cat?");
			String animals = scanner.nextLine();
			if (animals.equalsIgnoreCase("dog")) {
				System.out.println("   __\n        /  \\\n       / ..|\\\n      (_\\  |_)\n      /  \\@\' \n     /     \\\n_   /  `   |\n\\\\/  \\  | _\\\n \\   /_ || \\\\_\n  \\____)|_) \\_)"
						);
				loop = false;
				
			}
			else if(animals.equalsIgnoreCase("cat")) {
				System.out.println(
						"  |\\---/|\n   | ,_, |\n    \\_`_/-..----.\n ___/ `   \' ,\"\"+ \\  sk\n(__...\'   __\\    |`.___.\';\n  (_,...\'(_,.`__)/\'.....+"
						);
				loop = false;
			}
			else if(animals.equalsIgnoreCase("fish")) {
				System.out.println(
						"|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/"
						);
				loop = false;
			}
			else {
				System.out.println("invalid option!");
			}
		}
		
	}
}