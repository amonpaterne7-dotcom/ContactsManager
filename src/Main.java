public class Main {
    public static void main(String[] args) {

        //1. Créer le gestionnaire de contacts
        ContactsManager monGestionnaireContacts = new ContactsManager();

        //Premier contact
        Contact contact1 = new Contact();
        contact1.nom = "joëlle";
        contact1.numeroDeTelephone = "0503567898";
        monGestionnaireContacts.ajouterContact(contact1);

        //Deuxième contact
        Contact contact2 = new Contact();
        contact2.nom = "Elysée";
        contact2.numeroDeTelephone = "0120349590";
        monGestionnaireContacts.ajouterContact(contact2);

        //Troisième contact
        Contact contact3 = new Contact();
        contact3.nom = "Ivan";
        contact3.numeroDeTelephone = "05956758940";
        monGestionnaireContacts.ajouterContact(contact3);

        //Quatrième contact
        Contact contact4 = new Contact();
        contact4.nom = "Paul David";
        contact4.numeroDeTelephone = "0134578909";
        monGestionnaireContacts.ajouterContact(contact4);

        //Cinquième contact
        Contact contact5 = new Contact();
        contact5.nom = "Jennifer";
        contact5.numeroDeTelephone = "0705060708";
        monGestionnaireContacts.ajouterContact(contact5);

        //Rechercher un contact et afficher son numéro
        Contact trouve = monGestionnaireContacts.rechercherContact("Jennifer");
        if (trouve != null) {
            System.out.println("Contact trouvé : " + trouve.nom);
            System.out.println("Numéro : " + trouve.numeroDeTelephone);
        } else {
            System.out.println("Contact non trouvé.");
        }
    }
}