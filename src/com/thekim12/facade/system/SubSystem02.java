package com.thekim12.facade.system;

class SubSystem02 {
    public SubSystem02(){
        System.out.println("Call Constructor : " + getClass().getSimpleName());
    }

    public void process(){
        System.out.println("Call Process : "+ getClass().getSimpleName());
    }
}
