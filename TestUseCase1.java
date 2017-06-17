import java.util.ArrayList;

/**
 * Creates two Contact objects to ContactList. Prints the ContactList to show
 * that both got into the list. If last name is missing, the Contact object will
 * not be entered to the list.
 */
public class TestUseCase1 {
    public static void main(String[] args) {
        /**
         * Constructs a new ContactList object.
         */
        ContactList contactList = new ContactList();

        /**
         * Constructs a new Contact object, prints the contact list. Constructs
         * a second Contact object, prints the updated contact list.
         */
        for (int i = 0; i < 2; i++) {
            Contact contact = contactList.readEntry();
            contactList.addContact(contact);
            System.out.println("=== Contact List === \n" 
                               + contactList 
                               + "=== End of Contact list === \n\n");
        }
    }
}


/*
 * OUTPUT
Please enter the following information:
Last Name (required): Lee
First Name:           Florence
Address:              12345, Los Altos, CA
Email:                
Phone Number:         650-123-8405
Notes:                

=== Contact List === 
Name:                 Lee, Florence
Address:              12345, Los Altos, CA
Email:                
Phone Number:         650-123-8405
Notes:                
++++++++++++++++++++++++++++++++++++++++++++++++++
=== End of Contact list === 


Please enter the following information:
Last Name (required): James
First Name:           David
Address:              30 Buttercup Street, Mountain View, CA
Email:                Davidj@gmail.com
Phone Number:         
Notes:                His birthday is on June 20. 

=== Contact List === 
Name:                 Lee, Florence
Address:              12345, Los Altos, CA
Email:                
Phone Number:         650-123-8405
Notes:                
++++++++++++++++++++++++++++++++++++++++++++++++++
Name:                 James, David
Address:              30 Buttercup Street, Mountain View, CA
Email:                Davidj@gmail.com
Phone Number:         
Notes:                His birthday is on June 20. 
++++++++++++++++++++++++++++++++++++++++++++++++++
=== End of Contact list === 

 */
