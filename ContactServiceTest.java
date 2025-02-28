import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class ContactServiceTest {



    @Test
    void testValidAddContact() {
        ContactService service = new ContactService();
        service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");

        assertEquals(1, service.contacts.size());

        assertThrows(IllegalArgumentException.class, () -> {service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");});
    }

    @Test
    void testChangeFirstName() {
        ContactService service = new ContactService();
        service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");

        service.changeFirstName("1", "Joshua");

        assertEquals("Joshua", service.contacts.getFirst().getFirstName());
    }

    @Test
    void testChangeLastName() {
        ContactService service = new ContactService();
        service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");

        service.changeLastName("1", "Johnson");

        assertEquals("Johnson", service.contacts.getFirst().getLastName());
    }

    @Test
    void testChangePhone() {
        ContactService service = new ContactService();
        service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");

        service.changePhone("1", "9897655555");

        assertEquals("9897655555", service.contacts.getFirst().getPhone());
    }

    @Test
    void testChangeAddress() {
        ContactService service = new ContactService();
        service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");

        service.changeAddress("1", "23 Goofy Goober Road");

        assertEquals("23 Goofy Goober Road", service.contacts.getFirst().getAddress());
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        service.addContact("1", "Justin", "Faircloth", "9898988989", "1 SNHU Lane");

        service.deleteContact("1");

        assertEquals(0, service.contacts.size());
    }
}