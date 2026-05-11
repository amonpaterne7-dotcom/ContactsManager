public class ContactsManager {
    Contact[] contacts;
    int contactCount;

    // Default constructor
    ContactsManager() {
        this.contactCount = 0;
        this.contacts = new Contact[500];
    }

    // Add a contact
    void addContact(Contact contact) {
        contacts[contactCount] = contact;
        contactCount++;
    }

    // Search a contact by name
    Contact searchContact(String searchName) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].name.equals(searchName)) {
                return contacts[i];
            }
        }
        return null;
    }
}