package arrays;

import java.util.ArrayList;

public class MobilePhone {

	public ArrayList<Contact> contacts = new ArrayList<>();
	
	public void printListOfContacts() {
		for (Contact contact : contacts) {
			System.out.println(contact.toString());
		}
	}
	
	public void addNewContact(String name, String phoneNumber) {
		Contact newContact = new Contact(name, phoneNumber);
		if (this.doesContactAlreadyExist(newContact)) {
			System.out.println("Could not add contact. Contact " + name + " with number " + phoneNumber + " already exists!");
			return;
		}
		this.contacts.add(newContact);
	}

	public void updateContact(Contact oldContact, String newName, String newPhoneNumber) {

		if (!this.doesContactAlreadyExist(oldContact)) {
			System.out.println("Your phone has no contact with the name" + oldContact.getName());
			return;
		}

		for (Contact contact : contacts) {
			if (contact.equals(oldContact)) {
				contact.setName(newName);
				contact.setPhoneNumber(newPhoneNumber);
			}
		}

	}

	private boolean doesContactAlreadyExist(Contact contact) {
		for (Contact otherContact : contacts) {
			if (otherContact.equals(contact)) {
				return true;
			}
		}
		return false;
	}

}
