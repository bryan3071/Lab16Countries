package Lab16Countries;

import java.io.IOException;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) throws IOException {
		{
			// TODO Auto-generated method stub
			
			boolean done = false;
			while (!done) {
				System.out.println("Select an option: (1 for Viewing current file, 2 for Adding country and population to the file or 3 To quit)");
				Scanner scnr = new Scanner (System.in);
				String option = scnr.nextLine();
				switch (option) {
				case "1":
					CountriesTextFile.readFile();
					break;
			case "2":
					doSelectOption();
					break;
				case "3":
					done = true;
				doEndOption();
					break;
				default:
				System.out.println("Invalid choice...");
				break;
				}
			}
			
			
			
			
		}

	}
	
	public static void doSelectOption() throws IOException {
		Scanner scnr = new Scanner(System.in);

		System.out.println("List a country to add to our list");
		String name = scnr.nextLine();
		System.out.print("Enter that countries population: ");
		int populationNum = scnr.nextInt();
		Country country = new Country(name, populationNum);
		
		CountriesTextFile ctf = new CountriesTextFile();
		ctf.appendToFile(country);
		
		ctf.readFile();
		}
	
	public static void doEndOption() {
		System.out.println("Thank you for using the application");
		
	}


//	private static void rewriteFile(List<String> items) throws IOException {
//		//if (Files.notExists(filePath)) {
//			Files.createFile(filePath);
//		}
//
//		// ** Example of rewriting a whole file
//		Files.write(filePath, items, StandardOpenOption.TRUNCATE_EXISTING);
//	}

}
