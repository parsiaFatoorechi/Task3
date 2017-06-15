
/**
 * One object of class ContactList stores the whole list of Contacts.
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
     * Add a new Contact object to the ContactList.
     */
    public void addContact(Contact newContact) {
        System.out.println(newContact);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    /**
     * Prints the entire ContactList. Sorted by last name, then first name. The
     * sorting is case insensitive.
     */
    public String toString() {
     // add sort()
        return "";
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
     * Saves to a data file on the File containing all of the current contacts.
     */
    public void saveToFile() {
    }

}
