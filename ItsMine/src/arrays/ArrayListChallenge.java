package arrays;


public class ArrayListChallenge {

	public static void main(String args[]) {
		MobilePhone ourPhone = new MobilePhone();
		ourPhone.addNewContact("Peter", "015547");

		ourPhone.printListOfContacts();
		
		Contact oldContact = new Contact("Peter", "");
		ourPhone.updateContact(oldContact, "Wiebke", "032451");
		
		ourPhone.printListOfContacts();
		//Contact replacementContact = new Contact("Wiebke", "897457");
	//	ourPhone.contacts.set(ourPhone.contacts.indexOf(), replacementContact);
		//System.out.println(ourPhone.contacts);

	}
}
