package main.com.myApp.crud;

import main.com.myApp.model.Product;
import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueriesIntoDatabase {
    public static void main(String args[]) {
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .configure("hibernate-config.xml")
                .buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        // select al users from DB
        List<User> users = session.createQuery("FROM User", User.class).getResultList();
        for (User user : users) {
            System.out.println(user);
        }

        // aggregation functions
     List tot= session.createQuery("select sum(quantity) from Product").getResultList();
     List count= session.createQuery("select count(*) from Product where price>90").getResultList();
     List maxPrice= session.createQuery("select max(price) from Product").getResultList();
     List minPrice= session.createQuery("select min(price) from Product").getResultList();
     List avgPrice= session.createQuery("select avg(price) from Product").getResultList();

     System.out.println(tot);
     System.out.println(count);
     System.out.println(maxPrice);
     System.out.println(minPrice);
     System.out.println(avgPrice);

    }
}