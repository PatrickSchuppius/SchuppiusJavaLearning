package collections;

public class Contact {

	private String name;
	private String phoneNumber;

	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getPhoneNumber() {
		return phoneNumber.trim();
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Contact: " + name + ", Phone Number=" + phoneNumber;
	}

	public boolean equals(Contact other) {
		if (this.name.equalsIgnoreCase(other.getName())) {
			return true;
		}
		return false;
	}
	
}
