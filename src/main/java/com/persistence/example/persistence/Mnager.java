package com.persistence.example.persistence;

import org.springframework.stereotype.Component;

@Component
public class Mnager extends  Employee{

    static{
        System.out.println("hello from Manager static block");
    }

    {
        System.out.println("one more instance block in Manager");
    }
    {
        System.out.println("hello from Manager instance block");
    }

    public Mnager() {
        System.out.println("hello from Manager constructor");
    }

    public  String msg(String name){
        return "Hello , " + name;
    }


}
