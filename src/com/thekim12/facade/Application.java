package com.thekim12.facade;

import com.thekim12.facade.system.Facade;

public class Application {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();

    }
}