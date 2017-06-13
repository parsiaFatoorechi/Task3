
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates a Contact object. Tests class ContactList by calling all methods on a
 * ContactList object.
 */

public class Main {
    public static void main(String[] args) {
        /**
         * Constructs a new Contact object and calls all methods defined in
         * class Contact.
         */
        Contact contact = new Contact();
        contact.setFirstName("");
        contact.setLastName("");
        contact.setStreetAddress("");
        contact.setEmail("");
        contact.setPhone("");
        contact.setNotes("");

        System.out.println("First name: " + contact.getFirstName());
        System.out.println("Last name: " + contact.getLastName());
        System.out.println("Street address: " + contact.getStreetAddress());
        System.out.println("Email: " + contact.getEmail());
        System.out.println("Phone number: " + contact.getPhone()); 
        System.out.println("Notes: " + contact.getNotes()); 
        
        /**
         * Constructs a new ContactList object.
         */
        ContactList contactList = new ContactList();
        
        /**
         * Load contact list from file. 
         */
        contactList.loadContactsFromFile(); 

        /**
         * Add a new Contact object to the Contactlist.
         */
        contactList.addContact(contact);

        /**
         * Prints the entire contact list.
         */
        System.out.println(contactList); // call the toString() implicitly

        /**
         * Retrieves a person's information by last name.
         */
        System.out.println(contactList.searchByLastName(""));

        /**
         * Saves the data to the File containing all of the current contacts
         * when the user quits the program.
         */
        contactList.saveToFile();

        System.out.println("end of program");
    }
}

/*
 * OUTPUT
First name: 
Last name: 
Street address: 
Email: 
Phone number: 
Notes: 


end of program
 */
