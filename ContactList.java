
/**
 * One object of class ContactList stores the whole list of Contacts.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;

class ContactList {

    /* Stores all the contacts */
    private ArrayList<Contact> contacts;

    /**
     * Default constructor to initialize the ArrayList of contacts. Calls
     * loadContactsFromFile() to load the contacts from file.
     */
    public ContactList() {
    }

    /**
     * Opens existing data file on disk and populates contacts with the file's
     * content. If the file is not found, the contact list will be empty.
     */
    public void loadContactsFromFile() {
    }

    /**
     * Add a new Contact object to the Contactlist.
     */
    public void addContact(Contact newContact) {
    }

    /**
     * Prints the entire contact list. Sorted by last name, then first name. The
     * sorting is case insensitive.
     */
    public String toString() {
        return "";
        // add sort()
    }

    /**
     * Retrieves a person's information by last name. The search is case
     * insensitive. Prompts the user if there is no such last name. Otherwise
     * returns a String containing contacts with that last name.
     */
    public String searchByLastName(String lastName) {
        return "";
    }

    /**
     * Saves to a data file on the File containing all of the current contacts
     * when the user quits the program.
     */
    public void saveToFile() {
    }

}