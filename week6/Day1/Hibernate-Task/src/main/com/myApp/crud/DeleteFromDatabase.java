package main.com.myApp.crud;


import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteFromDatabase {
    public static void main(String[] args) {
        // define the Session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        //define session
        Session session = sessionFactory.getCurrentSession();

        // start transaction
        session.beginTransaction();

        // get user object by id from DB
       User user = session.get(User.class, 2);

        // delete user
        session.delete(user);

        // commit the transaction
        session.getTransaction().commit();
    }
}
