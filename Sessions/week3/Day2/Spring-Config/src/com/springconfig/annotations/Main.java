
package com.springconfig.annotations;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);
        Circle circle = container.getBean("circle", Circle.class);
        Rectangle rectangle = container.getBean("rectangle", Rectangle.class);
        Triangle triangle = container.getBean("triangle", Triangle.class);
        circle.getName();
        rectangle.getName();
        rectangle.draw();
        circle.draw();
        triangle.draw();

    }
}