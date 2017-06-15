import java.util.ArrayList;
import java.util.Scanner;

/**
 * Creates two Contact objects. Prints the list to show that both got into
 * the list. 
 */

public class TestUseCase1 {
    public static void main(String[] args) {

        /**
         * Constructs a new ContactList object.
         */
        ContactList contactList = new ContactList();

        /**
         * Constructs a new Contact object
         */
        Contact contact = new Contact();
        
        // Gets input from the user 
        System.out.println("Please enter the following information to create a new contact:");
        contact.setLastName("Maier");
        contact.setFirstName("Vincent");
        contact.setStreetAddress("");
        contact.setEmail("brimo1992@gmail.com");
        contact.setPhone("650-315-7177");
        contact.setNotes("His birthday is January 15.");

        System.out.println("Last Name (required): " + contact.getLastName());
        System.out.println("First Name:           " + contact.getFirstName());
        System.out.println("Address:              " + contact.getStreetAddress());
        System.out.println("Email:                " + contact.getEmail());
        System.out.println("Phone Number:         " + contact.getPhone());
        System.out.println("Notes:                " + contact.getNotes() + "\n");

        // Adds the new contact to the ContactList, and prints it out immediately. 
        System.out.println("\nThe first contact has been created to the contact list as below:");
        contactList.addContact(contact);

        /**
         * Constructs a second Contact object.
         */
        Contact contact1 = new Contact();

        // Gets input from the user 
        System.out.println("\nPlease enter the following information to create a new contact:");
        contact1.setLastName("Maclean");
        contact1.setFirstName("Bob");
        contact1.setStreetAddress("15 Baker Street, Chico, CA");
        contact1.setEmail("bobmcln@zombie.com");
        contact1.setPhone("650-344-8927");
        contact1.setNotes("This guy makes great lasagna.");
        
        System.out.println("Last Name (required): " + contact1.getLastName());
        System.out.println("First Name:           " + contact1.getFirstName());
        System.out.println("Address:              " + contact1.getStreetAddress());
        System.out.println("Email:                " + contact1.getEmail());
        System.out.println("Phone Number:         " + contact1.getPhone());
        System.out.println("Notes:                " + contact1.getNotes() + "\n");

        // Adds the new contact to the ContactList, and prints it out immediately.
        System.out.println("\nThe second contact has been created to the contact list as below:");
        contactList.addContact(contact1);

        /**
         * Prints all Contact objects from the list.
         */
        System.out.println("\n\nHere is the contact list with all contacts:");
        contactList.addContact(contact);
        contactList.addContact(contact1);
    }
}


/*
 * OUTPUT
Please enter the following information to create a new contact:
Last Name (required): Maier
First Name:           Vincent
Address:              
Email:                brimo1992@gmail.com
Phone Number:         650-315-7177
Notes:                His birthday is January 15.


The first contact has been created to the contact list as below:
Name:                 Vincent Maier
Address:              
Email:                brimo1992@gmail.com
Phone Number:         650-315-7177
Notes:                His birthday is January 15.

+++++++++++++++++++++++++++++++++++++++++++++++++++++

Please enter the following information to create a new contact:
Last Name (required): Maclean
First Name:           Bob
Address:              15 Baker Street, Chico, CA
Email:                bobmcln@zombie.com
Phone Number:         650-344-8927
Notes:                This guy makes great lasagna.


The second contact has been created to the contact list as below:
Name:                 Bob Maclean
Address:              15 Baker Street, Chico, CA
Email:                bobmcln@zombie.com
Phone Number:         650-344-8927
Notes:                This guy makes great lasagna.

+++++++++++++++++++++++++++++++++++++++++++++++++++++


Here is the contact list with all contacts:
Name:                 Vincent Maier
Address:              
Email:                brimo1992@gmail.com
Phone Number:         650-315-7177
Notes:                His birthday is January 15.

+++++++++++++++++++++++++++++++++++++++++++++++++++++
Name:                 Bob Maclean
Address:              15 Baker Street, Chico, CA
Email:                bobmcln@zombie.com
Phone Number:         650-344-8927
Notes:                This guy makes great lasagna.

+++++++++++++++++++++++++++++++++++++++++++++++++++++

 */
