package lesson_8.phone;

public class PhoneBook {
    // fields
    Contact [] contacts = new Contact[100];

    // constructor
    public PhoneBook() {
    }


    // methods
    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] == null) {
                contacts[i] = contact;
                break;
            }
        }
    }

    public Contact searchContact(String nameOfContact) {

        return null;
    }

    public void deleteContact(String nameOfContact) {

    }

    public Contact editContact(String searchName, String newnameOfContact) {

        return null;
    }
}
