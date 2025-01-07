package main.com.myApp.crud;

import main.com.myApp.model.Passport;
import main.com.myApp.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class CreatePersonANDPassport
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

            Person person = new Person("Asseel","Ahmed",new Date());
           session.save(person);
            Passport passport=new Passport( person,"123456",new Date());

            session.save(passport);

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
