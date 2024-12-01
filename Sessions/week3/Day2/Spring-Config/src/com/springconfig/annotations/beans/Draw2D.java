package com.springconfig.annotations;

import org.springframework.stereotype.Component;

@Component
public class Draw2D {
    public void draw(String name) {
        System.out.println(name+ " is drawn in 2D");
    }
}
