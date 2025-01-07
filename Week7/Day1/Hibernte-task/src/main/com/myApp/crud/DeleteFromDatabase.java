package main.com.myApp.crud;

import main.com.myApp.model.Passport;
import main.com.myApp.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteFromDatabase
{
    public static void main(String[] args) {
        // define the Session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();
        //define session
        Session session = sessionFactory.getCurrentSession();
        try {

           //open the transaction
            session.beginTransaction();

            Passport passport = session.get(Passport.class,2);
            session.delete(passport);
            session.getTransaction().commit();

        }catch (Exception exception)
        {
            exception.printStackTrace();
        }finally {
            session.close();
        }

    }
}
