package main.com.myApp.crud;

import main.com.myApp.model.Product;
import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class CreateIntoDatabase {

    public static void main(String args[]){
        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .configure("hibernate-config.xml")
                .buildSessionFactory();

        Session session=sessionFactory.getCurrentSession();
        session.beginTransaction();
        User user=new User("hanin","h123");
//        User user1=new User("Ahmed","a123");
        Product product=new Product("laptop","dell",50000,10,"dell", new Date());
        session.save(user);
//        session.save(user1);
        session.save(product);
        session.getTransaction().commit();

    }
}
