package Task3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * One object of class ContactList stores the whole list of Contacts.
 */

class ContactList {

    /* Stores all the contacts */
    private ArrayList<Contact> contacts;
    private Scanner scanner;

    /**
     * Default constructor to initialize the ArrayList of contacts. Calls
     * loadContactsFromFile() to load the contacts from file.
     */
    public ContactList() {
        contacts = new ArrayList<Contact>();
        scanner = new Scanner(System.in);
    }

    /**
     * Opens existing data file on disk and populates contacts with the file's
     * content. If the file is not found, the contact list will be empty.
     */
    public void loadContactsFromFile() {
    }

    /**
     * Add a new Contact object to the ContactList.
     */
    public void addContact(Contact newContact) {
        contacts.add(newContact);
    }

    /**
     * Gets input from the user.
     */
    public Contact readEntry() {
        System.out.print("Please enter the following information:" 
                         + "\nLast Name (required): ");
        String lastName = scanner.nextLine();
        
        // Omits all white spaces
        String testLastName = lastName.trim();  
        
        // Asks user to enter last name if it is left blank.
        if (testLastName.isEmpty()) {
            System.out.println("*** Last name is required ***\n\n");
            return readEntry();
        } else {
            
            // Constructs a Contact object to store the user input.
            Contact newContact = new Contact(lastName);
            
            System.out.print("First Name:           ");
            String firstName = scanner.nextLine();
            newContact.setFirstName(firstName);

            System.out.print("Address:              ");
            String streetAddress = scanner.nextLine();
            newContact.setStreetAddress(streetAddress);

            System.out.print("Email:                ");
            String email = scanner.nextLine();
            newContact.setEmail(email);

            System.out.print("Phone Number:         ");
            String phone = scanner.nextLine();
            newContact.setPhone(phone);

            System.out.print("Notes:                ");
            String notes = scanner.nextLine();
            newContact.setNotes(notes);

            System.out.println("");
            return newContact;
        }
    }

    /**
     * Prints the entire ContactList. Sorted by last name, then first name. The
     * sorting is case insensitive.
     */
    public String toString() {
        String allcontacts = "";
        for (int i = 0; i < contacts.size(); i++) {
            allcontacts += contacts.get(i);
        }
        return allcontacts;
    }

    /**
     * Retrieves a person's information by last name. The search is case
     * insensitive. Tells the user if there is no such last name. Otherwise
     * returns a String containing contacts with that last name.
     */
    public String searchByLastName(String lastName) {
        return "";
    }

    /**
     * Saves to a data file on the File containing all of the current contacts.
     */
    public void saveToFile() {
    }

}
