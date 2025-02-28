import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testValidConstructor () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);

        assertEquals(contactID, testContact.getContactID());
        assertEquals(firstName, testContact.getFirstName());
        assertEquals(lastName, testContact.getLastName());
        assertEquals(phone, testContact.getPhone());
        assertEquals(address, testContact.getAddress());
    }

    @Test
    void testNullContactID () {
        String contactID = null;
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testTooLongContactID () {
        String contactID = "123235436545456456";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testNullFirstName () {
        String contactID = "13";
        String firstName = null;
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testTooLongFirstName () {
        String contactID = "13";
        String firstName = "Justinnnnnnnn";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testNullLastName () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = null;
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testTooLongLastName () {
        String contactID = "1";
        String firstName = "Justin";
        String lastName = "Fairclothhhhhhh";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testNullPhone () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = null;
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testTooLongPhone () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9108787676767";
        String address = "123 SNHU Lane";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testNullAddress () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9108988787";
        String address = null;

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testTooLongAddress () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9108988787";
        String address = "jhfdsgbjdfgdjbgkjdsbgldksbgldbgjlhdfb";

        assertThrows(IllegalArgumentException.class, () -> {Contact testContact = new Contact(contactID, firstName, lastName, phone, address);});
    }

    @Test
    void testInvalidFirstNameSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);

        assertThrows(IllegalArgumentException.class, () -> {testContact.setFirstName("jdbfsglbdfgkjbdslfgj");});
    }

    @Test
    void testValidFirstNameSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
        testContact.setFirstName("Jonathan");

        assertEquals("Jonathan", testContact.getFirstName());
    }

    @Test
    void testInvalidLastNameSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);

        assertThrows(IllegalArgumentException.class, () -> {testContact.setLastName("jdbfsglbdfgkjbdslfgj");});
    }

    @Test
    void testValidLastNameSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
        testContact.setLastName("Abrams");

        assertEquals("Abrams", testContact.getLastName());
    }

    @Test
    void testInvalidPhoneSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9188988383";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);

        assertThrows(IllegalArgumentException.class, () -> {testContact.setPhone("jdbfsglbdfgkjbdslfgj");});
    }

    @Test
    void testValidPhoneSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
        testContact.setPhone("9897655443");

        assertEquals("9897655443", testContact.getPhone());
    }

    @Test
    void testInvalidAddressSetter () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);

        assertThrows(IllegalArgumentException.class, () -> {testContact.setAddress("jdbfsglbdf5645g5dg4t5gdg4ggkjbdslfgj");});
    }

    @Test
    void testValidAddress () {
        String contactID = "13";
        String firstName = "Justin";
        String lastName = "Faircloth";
        String phone = "9123674567";
        String address = "123 SNHU Lane";

        Contact testContact = new Contact(contactID, firstName, lastName, phone, address);
        testContact.setAddress("324 Circle Road");

        assertEquals("324 Circle Road", testContact.getAddress());
    }
}


