import java.util.ArrayList;

/**
 * Creates two Contact objects to the ContactList. Prints the ContactList to
 * show that both got into the list. If last name is missing, the Contact object
 * will not be entered to the ContactList.
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
        System.out.println(
                "Please enter the following information:\n");
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

        // Adds the new Contact object to the ContactList and prints to console
        // if last name has been entered.  
        if ( contact.getLastName() != "" ) { 
            System.out.println( 
                    "Below new contact has been created to the contact list:\n");
            contactList.addContact(contact); 
        }  else {
            System.out.println( 
                    "Your contact cannot be saved without a last name");
        }

        /**
         * Constructs a second Contact object.
         */
        Contact contact1 = new Contact();

        // Gets input from the user 
        System.out.println(
                "\nPlease enter the following information:\n");
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

        // Adds the new Contact object to the ContactList and prints to console
        // if last name has been entered.  
        if ( contact1.getLastName() != "" ) { 
            System.out.println( 
                    "Below new contact has been created to the contact list:\n");
            contactList.addContact(contact1); 
        }  else {
            System.out.println( 
                    "Your contact cannot be saved without a last name");
        }

        /**
         * Prints all Contact objects from the list.
         */
        System.out.println("\n\nHere is the contact list with all contacts:\n");
        if ( contact.getLastName() != "" ) {
            contactList.addContact(contact);
        }
        if ( contact1.getLastName() != "" ) {
            contactList.addContact(contact1);
        }
        
    }
}


/*
 * OUTPUT
Please enter the following information:

Last Name (required): Maier
First Name:           Vincent
Address:              
Email:                brimo1992@gmail.com
Phone Number:         650-315-7177
Notes:                His birthday is January 15.

Below new contact has been created to the contact list:

Name:                 Maier, Vincent
Address:              
Email:                brimo1992@gmail.com
Phone Number:         650-315-7177
Notes:                His birthday is January 15.

+++++++++++++++++++++++++++++++++++++++++++++++++++++

Please enter the following information:

Last Name (required): Maclean
First Name:           Bob
Address:              15 Baker Street, Chico, CA
Email:                bobmcln@zombie.com
Phone Number:         650-344-8927
Notes:                This guy makes great lasagna.

Below new contact has been created to the contact list:

Name:                 Maclean, Bob
Address:              15 Baker Street, Chico, CA
Email:                bobmcln@zombie.com
Phone Number:         650-344-8927
Notes:                This guy makes great lasagna.

+++++++++++++++++++++++++++++++++++++++++++++++++++++


Here is the contact list with all contacts:

Name:                 Maier, Vincent
Address:              
Email:                brimo1992@gmail.com
Phone Number:         650-315-7177
Notes:                His birthday is January 15.

+++++++++++++++++++++++++++++++++++++++++++++++++++++
Name:                 Maclean, Bob
Address:              15 Baker Street, Chico, CA
Email:                bobmcln@zombie.com
Phone Number:         650-344-8927
Notes:                This guy makes great lasagna.

+++++++++++++++++++++++++++++++++++++++++++++++++++++

 */
