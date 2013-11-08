package banking;

public class Address {

	private int number;

	private String street;

	private String streetType;

	public Address() {
		this(-1, null, null);
	}

	public Address(int number, String street, String streetType)
	{
		/*
		 * TODO set number, street, and streetType
		 * using setNumber(), setStreet(), and setStreetType()
		 */
		setNumber(number);
		setStreet(street);
		setStreetType(streetType);
	}
	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the streetType
	 */
	public String getStreetType() {
		return streetType;
	}

	/**
	 * @param streetType
	 *            the streetType to set
	 */
	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}
	
	public String getAddress()
	{
		return toString();
	}
	
	@Override
	public String toString() {
		String address = "";
		/*
		 * TODO set address to show the full address string
		 * Example. if number is 12 and street is "Main" and
		 * streetType is "ave". Then address should be
		 * "12 Main ave"
		 */
		address = getNumber() + getStreet() + getStreetType(); 
		return address;
	}
}
