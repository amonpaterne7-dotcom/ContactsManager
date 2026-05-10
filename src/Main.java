public class Main {
    public static void main (String[] args) {

        //ContactsManager
        ContactsManager myContactsManager = new ContactsManager();

        //Premier contact
        Contact contact1 = new Contact();
        contact1.name = "Joëlle";
        contact1.phoneNumber = "0503211653";
        myContactsManager.addContact(contact1);

        //Deuxième contact
        Contact contact2 = new Contact();
        contact2.name = "Elysée";
        contact2.phoneNumber = "0153986971";
        myContactsManager.addContact(contact2);

        //Troisième contact
        Contact contact3 = new Contact();
        contact3.name = "Ivan";
        contact3.phoneNumber = "0595919581";
        myContactsManager.addContact(contact3);

        //Quatrième contact
        Contact contact4 = new Contact();
        contact4.name = "Paul David";
        contact4.phoneNumber = " 0700615948";
        myContactsManager.addContact(contact4);

        //Cinquième contact
        Contact contact5 = new Contact();
        contact5.name = "Jennifer";
        contact5.phoneNumber = "0170202256";
        myContactsManager.addContact(contact5);

        //Recherche d'un contact et affichage de son numéro
        Contact found = myContactsManager.searchContact("Jennifer");

        if (found != null) {
            System.out.println("Contact trouvé : " + found.name);
            System.out.println("Numéro de téléphone : " + found.phoneNumber);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}