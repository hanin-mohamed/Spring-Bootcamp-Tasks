package main.com.myApp.crud;

import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateDatabase {

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

        // get object by id from DB
        User user = session.get(User.class, 2);
        System.out.println(user);

        // update user  object
        user.setFirstName("Reem");
        user.setLastName("Amr");
        System.out.println(user);
        // commit the transaction
        session.getTransaction().commit();
    }
}