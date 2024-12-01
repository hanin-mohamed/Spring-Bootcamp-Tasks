
package com.springconfig.annotations;
import com.springconfig.annotations.beans.Circle;
import com.springconfig.annotations.beans.Shape;
import com.springconfig.annotations.config.Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        Shape circle = container.getBean("circle", Circle.class);
        circle.insertShape("Circle");
    }
}