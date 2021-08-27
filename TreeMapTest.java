import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Country c1 = new Country("India", "New Delhi", "Mr. Narendra Modi", "136.64 Crores", "Rs");
		Country c2 = new Country("Pakistan", "Islamabad", "Mr. Imran Khan", "21.66 Crores", "Pakistani Rupee");
		Country c3 = new Country("China", "Beijing", "Mr. Xi Jinping", "139.77 Crores", "Yuan");
		Country c4 = new Country("England", "London", "Mr. Boriss Johnson", "6.66 Crores", "Pound Sterling");
		Country c5 = new Country("America", "Washington DC", "Mr. Joe Biden", "32.82 Crores", "USD");
		
		TreeMap<String,Country> countryMap = new TreeMap<String,Country>();
		
		countryMap.put("IND", c1);
		countryMap.put("PAK", c2);
		countryMap.put("CHI", c3);
		countryMap.put("ENG", c4);
		countryMap.put("USA", c5);
		
		if(countryMap.containsKey("IND")) {
			Country theCountry = countryMap.get("IND");
			System.out.println("Country : "+theCountry);
		}
		else {
			System.out.println("Key not found ");
		}
		
		System.out.println("---------------");
		Set<String> keySet = countryMap.keySet();
		
		for (String theKey : keySet) {
			Country theCountry = countryMap.get(theKey);
			System.out.println("Country : "+theCountry);
		}
		
	}
}
//key and value
class Country
{
	private String name;
	private String capital;
	private String currency;
	private String population;
	private String primeMinister;
	
	public Country(String name, String capital, String primeMinister,String population,String currency) {
		super();
		this.name = name;
		this.capital = capital;
		this.currency = currency;
		this.population = population;
		this.primeMinister = primeMinister;
	}
	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + ", currency=" + currency + ", population="
				+ population + ", primeMinister=" + primeMinister + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getPrimeMinister() {
		return primeMinister;
	}
	public void setPrimeMinister(String primeMinister) {
		this.primeMinister = primeMinister;
	}
	
	
}