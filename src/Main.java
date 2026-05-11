public class Main {
    public static void main(String[] args) {

        // 1. Create the ContactsManager object
        ContactsManager myContactsManager = new ContactsManager();

        // 2. First contact
        Contact contact1 = new Contact();
        contact1.name = "Joëlle";
        contact1.phoneNumber = "0503567898";
        myContactsManager.addContact(contact1);

        // 3. Second contact
        Contact contact2 = new Contact();
        contact2.name = "Elysée";
        contact2.phoneNumber = "0120349590";
        myContactsManager.addContact(contact2);

        // 4. Third contact
        Contact contact3 = new Contact();
        contact3.name = "Ivan";
        contact3.phoneNumber = "05956758940";
        myContactsManager.addContact(contact3);

        // 5. Fourth contact
        Contact contact4 = new Contact();
        contact4.name = "Paul David";
        contact4.phoneNumber = "0134578909";
        myContactsManager.addContact(contact4);

        // 6. Fifth contact
        Contact contact5 = new Contact();
        contact5.name = "Jennifer";
        contact5.phoneNumber = "0705060708";
        myContactsManager.addContact(contact5);

        // 7. Search a contact and display phone number
        Contact found = myContactsManager.searchContact("Jennifer");
        if (found != null) {
            System.out.println("Contact found : " + found.name);
            System.out.println("Phone number  : " + found.phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }
    }
}