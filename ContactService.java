import java.util.ArrayList;

public class ContactService {

    public ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String contactID, String firstName, String lastName, String phone, String address) {

        boolean alreadyExists = false;
        for (Contact contact : contacts) {
            if (contact.getContactID() == contactID) {
                alreadyExists = true;
            }
        }

        if (alreadyExists) {
            throw new IllegalArgumentException("This contact ID already exists.");
        } else {
            Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
            contacts.add(newContact);
        }
    }


    public void deleteContact(String contactID) {

        contacts.removeIf(contact -> contact.getContactID() == contactID);
    }

    public void changeFirstName(String contactID, String newFirstName) {
        for(Contact contact : contacts) {
            if (contact.getContactID() == contactID) {
                contact.setFirstName(newFirstName);
            }
        }
    }

    public void changeLastName(String contactID, String newLastName) {
        for(Contact contact : contacts) {
            if (contact.getContactID() == contactID) {
                contact.setLastName(newLastName);
            }
        }
    }

    public void changePhone(String contactID, String newPhone) {
        for(Contact contact : contacts) {
            if (contact.getContactID() == contactID) {
                contact.setPhone(newPhone);
            }
        }
    }

    public void changeAddress(String contactID, String newAddress) {
        for(Contact contact : contacts) {
            if (contact.getContactID() == contactID) {
                contact.setAddress(newAddress);
            }
        }
    }
}
