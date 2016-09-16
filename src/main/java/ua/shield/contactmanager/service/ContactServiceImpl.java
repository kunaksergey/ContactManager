package ua.shield.contactmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.shield.contactmanager.dao.ContactDAO;
import ua.shield.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by sa on 16.09.16.
 */
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    ContactDAO contactDAO;

    @Transactional
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    public List<Contact> listContact() {
        return contactDAO.listContact();
    }

    @Transactional
    public void removeContact(Integer id) {
         contactDAO.removeContact(id);
    }
}
