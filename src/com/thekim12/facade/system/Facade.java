package com.thekim12.facade.system;

public class Facade {

    private SubSystem01 subSystem01;
    private SubSystem02 subSystem02;
    private SubSystem03 subSystem03;

    public Facade(){
        subSystem01 = new SubSystem01();
        subSystem02 = new SubSystem02();
        subSystem03 = new SubSystem03();
    }

    public void process(){
        subSystem01.process();
        subSystem02.process();
        subSystem03.process();

    }
}
