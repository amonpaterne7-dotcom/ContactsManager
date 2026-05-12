public class Main {
    public static void main(String[] args) {

        // Création du gestionnaire
        ContactsManager myContactsManager = new ContactsManager();

        // Ajout des 5 contacts
        Contact contact1 = new Contact();
        contact1.name = "Joëlle";
        contact1.phoneNumber = "0503567898";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Elysée";
        contact2.phoneNumber = "0120349590";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Ivan";
        contact3.phoneNumber = "05956758940";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Paul David";
        contact4.phoneNumber = "0134578909";
        myContactsManager.addContact(contact4);

        Contact contact5 = new Contact();
        contact5.name = "Jennifer";
        contact5.phoneNumber = "0705060708";
        myContactsManager.addContact(contact5);

        // Recherche et affichage du contact Jennifer
        Contact found = myContactsManager.searchContact("Jennifer");
        if (found != null) {
            System.out.println("Contact trouvé : " + found.name);
            System.out.println("Numéro : " + found.phoneNumber);
        } else {
            System.out.println("Contact introuvable.");
        }
    }
}