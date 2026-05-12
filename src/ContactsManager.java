public class ContactsManager {

    Contact[] contacts;  // Tableau de contacts
    int contactCount;    // Nombre de contacts enregistrés

    // Initialise un carnet vide
    ContactsManager() {
        this.contactCount = 0;
        this.contacts = new Contact[500];
    }

    // Ajoute un contact au carnet
    void addContact(Contact contact) {
        contacts[contactCount] = contact;
        contactCount++;
    }

    // Recherche un contact par nom, retourne null si introuvable
    Contact searchContact(String searchName) {
        for (int i = 0; i < contactCount; i++) {
            if (contacts[i].name.equals(searchName)) {
                return contacts[i]; // Contact trouvé
            }
        }
        return null; // Aucun résultat
    }
}