
class Flight {
	
	private int flightNumber;
	private String flightName;
	private String source;
	private String destination;
	private double ticketCost;
	
	private boolean isString(String stringToCheck) {
		return ((stringToCheck!=null)
				&& (!stringToCheck.equals(""))
				&& (stringToCheck.matches("^[a-zA-Z]*$")));
	}
	
	public Flight(int flightNumber, String flightName, String source, String destination, double ticketCost) {
		super();
		System.out.println("Flight(int,String,String,String,double) ctor...");
		if(flightNumber <=0) {
			System.out.println("flight number cannot be negative or zero");
		}
		else 
			this.flightNumber = flightNumber;
		
		if(isString(flightName)) {
			this.flightName = flightName;
		}
		else {
			System.out.println("Invalid flight Name...");
		}
		
		if(isString(source)) {
			this.source = source;
		}
		else {
			System.out.println("Invalid flight source...");
		}

		if(isString(source)) {
			this.destination = destination;
		}
		else {
			System.out.println("Invalid flight destination...");
		}
		
		
		if(ticketCost <=0) {
			System.out.println("ticketCost  cannot be negative or zero");
		}
		else
			this.ticketCost = ticketCost;
	}

	
	public Flight(int i, String j) {
		this(i,j, "","",0.0); // invoke the constructor of the same class - reuse it 
		System.out.println("Flight(int,String) ctor...");
	}
	
	public Flight(String j) {
		this(0,j, "","",0.0); // invoke the constructor of the same class - reuse it 
		System.out.println("Flight(String) ctor...");
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", source=" + source
				+ ", destination=" + destination + ", ticketCost=" + ticketCost + "]";
	}
	
	
}
public class Test {
	public static void main(String[] args) {
		Flight theFlight1 = new Flight(101,"AirIndia","Mumbai","London",55000);
		System.out.println(theFlight1);
		System.out.println("----------");
		Flight theFlight2 = new Flight(102,"IndianAirlines");
		System.out.println(theFlight2);
		System.out.println("----------");
		Flight theFlight3 = new Flight("BritishAirways");
		System.out.println(theFlight3);
		
	}
	
}
