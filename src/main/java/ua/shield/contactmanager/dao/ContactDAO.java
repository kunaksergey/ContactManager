package ua.shield.contactmanager.dao;

import ua.shield.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by sa on 16.09.16.
 */
public interface ContactDAO {
    void addContact(Contact contact);
    List<Contact> listContact();
    void removeContact(Integer id);

}
