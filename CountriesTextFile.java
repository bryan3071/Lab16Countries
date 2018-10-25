package Lab16Countries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountriesTextFile {

	private static Path filePath = Paths.get("country.txt");

	public static List<Country> readFile() {
		System.out.println("You selected choice 1");
		// ** Example of reading a file into a list
		try {
			List<String> lines = Files.readAllLines(filePath);
			List<Country> country = new ArrayList<>();
			for (String line : lines) {
				String[] parts = line.split("\t");
				Country c = new Country();
				c.setName(parts[0]);
				c.setPopulation(Integer.parseInt(parts[1]));
				country.add(c);
			}
			for (int i=0; i < country.size(); i++ ) {
			System.out.println(country.get(i));}
			return country;

		} catch (NoSuchFileException ex) {
			return new ArrayList<>();
		} catch (IOException ex) {
			ex.printStackTrace();
			return new ArrayList<>();
		}
	}
	
	public void appendToFile(Country Country) throws IOException {
		if ( Files.notExists(filePath) ) {
			Files.createFile(filePath);
		}
//		String line = String.format("%s\t%d", player.getName(), player.getJerseyNumber());
		String line = Country.getName() + "\t" + Country.getPopulation();
		
		// ** Example of adding to the end of a file
		
		List<String> linesToAdd = Arrays.asList(line);
		// Write those lines to the end of the file
		Files.write(filePath, linesToAdd, StandardOpenOption.APPEND);
	}

}
