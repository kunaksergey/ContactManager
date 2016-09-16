package ua.shield.contactmanager.service;

import ua.shield.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by sa on 16.09.16.
 */
public interface ContactService {
     void addContact(Contact contact);
     List<Contact> listContact();
     void removeContact(Integer id);

}
