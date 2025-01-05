package main.com.myApp.crud;

import main.com.myApp.model.Product;
import main.com.myApp.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateIntoDatabase {

    public static void main(String args[]){
        SessionFactory sessionFactory=new Configuration()
                .addAnnotatedClass(Product.class)
                .addAnnotatedClass(User.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session=sessionFactory.getCurrentSession();

    }
}
