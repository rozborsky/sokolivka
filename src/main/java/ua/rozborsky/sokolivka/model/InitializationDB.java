package ua.rozborsky.sokolivka.model;

import org.hibernate.SessionFactory;
import ua.rozborsky.sokolivka.server.HibernateUtil;

/**
 * Created by roman on 11.10.2016.
 */
public class InitializationDB {

    static SessionFactory sessionFactory = null;
    static{
        sessionFactory = HibernateUtil.getSessionFactory();
    }

//        CREATE SCHEMA `sokolivkadb` ;;


}
