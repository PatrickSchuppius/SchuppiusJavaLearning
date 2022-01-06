package collections;


public class ArrayListChallenge {

	public static void main(String args[]) {
		MobilePhone ourPhone = new MobilePhone();
		ourPhone.addNewContact("Peter", "015547");
		ourPhone.addNewContact("Patrick", "078715547");
		ourPhone.addNewContact("Fritz", "059438515547");
		ourPhone.addNewContact("Santa Claus", "01000005547");

		ourPhone.printListOfContacts();
		
		Contact oldContact = new Contact("Peter", "");
		ourPhone.updateContact(oldContact, "Wiebke", "032451");
		
		ourPhone.printListOfContacts();
		System.out.println("----------------");

		Contact contactToRemove = new Contact("Fritz", "");
		ourPhone.removeContact(contactToRemove);
		ourPhone.printListOfContacts();

		System.out.println(ourPhone.searchContact("Patrick"));
		System.out.println(ourPhone.searchContact("Fritz"));

		//Contact replacementContact = new Contact("Wiebke", "897457");
	//	ourPhone.contacts.set(ourPhone.contacts.indexOf(), replacementContact);
		//System.out.println(ourPhone.contacts);

	}
}
