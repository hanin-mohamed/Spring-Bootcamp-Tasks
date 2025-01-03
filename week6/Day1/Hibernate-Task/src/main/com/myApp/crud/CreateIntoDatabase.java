package main.com.myApp.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import  main.com.myApp.model.User;
public class CreateIntoDatabase {
    public static void main(String[] args) {
        // define the Session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();
        //define session
        Session session = sessionFactory.getCurrentSession();

        try {
           //open the transaction
            session.beginTransaction();

            User user1 = new User("Hanin","Ahmed");
            session.save(user1);
            User user2 = new User("Hanin","Ahmed");
            session.save(user2);
            // commit
            session.getTransaction().commit();

        }catch (Exception exception)
        {
            exception.printStackTrace();
        }finally {
            session.close();
        }

    }
}
