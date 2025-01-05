package main.com.myApp.crud;

import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadFromDatabase {
    public static void main(String []args){
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        Session session=sessionFactory.getCurrentSession();


        session.beginTransaction();

        int id=4;
      User student=session.get(User.class,id);
        System.out.println(student);

    }
}
