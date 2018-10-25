package Lab16Countries;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Country {
	
	
	
	String name;
	int population;
	public Country(String name, int population) {
		super();
		this.name = name;
		this.population = population;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + "]";
	}
	
	
	
	

}
