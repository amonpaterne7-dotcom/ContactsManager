class ContactsManager {
    Contact[] myFriends;
    int friendsCount;


    //construteur
    ContactsManager() {
        this.friendsCount = 0;
        this.myFriends = new Contact[500];
    }

    // Méthode addContact
    void addContact(Contact contact) {
        myFriends[friendsCount] = contact;
        friendsCount++;
    }

    // Méthode searchContact
    Contact searchContact(String searchName) {
        for (int i = 0; i < friendsCount; i++) {
            if (myFriends[i].name.equals(searchName)) {
                return myFriends[i];
            }
        }
        return null;
    }
}
