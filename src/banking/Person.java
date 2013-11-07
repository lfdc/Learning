package banking;

public class Person {

	private String firstName;

	private String lastName;

	private Address address;

	public Person() {
		this("", "");
	}

	public Person(String firstName, String lastName) {
		this(firstName, lastName, null);
	}

	public Person(String firstName, String lastName, Address address) {
		/*
		 * TODO Use setFirstName(), setLastName(), and setAddress()
		 * to set the firstName lastName and address
		 */
	}
	
	
	public String getName()
	{
		String fullName = null;
		
		/*
		 * Use getFirstName() and getLastName()
		 * to set fullName as the persons full name.
		 * Example. if first name is "Bob" and last name
		 * is "Smith". Then fullName should be "Bob Smith"
		 */
		
		return fullName;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
}
