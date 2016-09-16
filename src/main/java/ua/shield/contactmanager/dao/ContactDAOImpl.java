package ua.shield.contactmanager.dao;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.shield.contactmanager.domain.Contact;

import java.util.List;

/**
 * Created by sa on 16.09.16.
 */
@Repository
public class ContactDAOImpl implements ContactDAO {

    @Autowired
    SessionFactory sessionFactory;

    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Contact> listContact() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    public void removeContact(Integer id) {
        Contact contact = (Contact) sessionFactory.getCurrentSession().load(Contact.class, id);
            if(contact!=null){
                sessionFactory.getCurrentSession().delete(contact);
            }
    }

}
