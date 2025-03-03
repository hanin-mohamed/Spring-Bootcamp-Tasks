package main.com.myApp.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import  main.com.myApp.model.User;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;

public class CreateIntoDatabase {
    public static void main(String[] args) {
        // define the Session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        Session session1 = sessionFactory.getCurrentSession();
        session1.beginTransaction();
            User user1 = new User("Hanin","Ahmed");
            session1.save(user1);
        System.out.println(session1);
        session1.getTransaction().commit();

        // define Second Session factory
        Session session2 = sessionFactory.getCurrentSession();
        session2.beginTransaction();
        User user2 = new User("Hanin","Ahmed");
        session2.save(user2);
        System.out.println(session2);

        session2.getTransaction().commit();

    }
}

