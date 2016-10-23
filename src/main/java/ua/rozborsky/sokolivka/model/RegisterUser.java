package ua.rozborsky.sokolivka.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import ua.rozborsky.sokolivka.classes.PersonValidator;
import ua.rozborsky.sokolivka.classes.User;
import ua.rozborsky.sokolivka.server.HibernateUtil;

/**
 * Created by roman on 21.10.2016.
 */
@Component
public class RegisterUser {
    public static SessionFactory sessionFactory = null;
    static {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    public void addUser(User user) {
        Session session = null;
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if ((session != null) && (session.isOpen()))session.close();
        }
    }
}
