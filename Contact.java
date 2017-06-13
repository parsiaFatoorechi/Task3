
import java.io.Serializable;

/**
 * In memory representation of a contact of an individual, which contains
 * his/her lastName name, lastName name, street address, email address, phone
 * number and notes of an individual.
 */

public class Contact implements Comparable<Contact>, Serializable {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String email;
    private String phone;
    private String notes;

    /**
     * Default Constructor for Contact.
     */
    public Contact() {
    }

    /**
     * Parameterized Constructor for Contact is not needed.
     */
    /*
    public Contact(String firstName, String lastName, String streetAddress,
        String email, int phone, String notes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.email = email;
        this.phone = phone;
        this.notes = notes;
    }
    */

    // Sets the first name of this contact.
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Return the first name of this contact.
    public String getFirstName() {
        return firstName;
    }

    // Sets the last name of this contact.
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Returns the last name of this contact.
    public String getLastName() {
        return lastName;
    }

    // Sets the street address of this contact.
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    // Returns the street address of this contact.
    public String getStreetAddress() {
        return streetAddress;
    }

    // Sets the email of this contact.
    public void setEmail(String email) {
        this.email = email;
    }

    // Returns the email of this contact.
    public String getEmail() {
        return email;
    }

    // Sets the phone number of this contact.
    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Returns the phone number of this contact.
    public String getPhone() {
        return phone;
    }

    // Sets the notes of this contact.
    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Returns the notes of this contact.
    public String getNotes() {
        return notes;
    }

    /**
     * Return a String representation of this contact.
     */
    public String toString() { // Calls getters
        return "";
    }

    /**
     * Returns the value of less than, equal to or greater than.
     */
    public int compareTo(Contact other) {
        return 0;

        /*
         * int result = lastName.compareTo(other.lastName); if (result == 0) {
         * return firstName.compareTo(other.firstName); } else { return result;
         * }
         */
    }
}
