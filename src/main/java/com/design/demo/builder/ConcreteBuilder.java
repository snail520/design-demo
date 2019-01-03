package com.design.demo.builder;

/**
 * Created by gaoxiang on 19/1/3.
 */
public class ConcreteBuilder extends Builder {
    private Computer computer = new Computer();
    public void buildCPU() {
        computer.addPart("build cpu");
    }

    public void buildMainboard() {
        computer.addPart("build main board");
    }

    public void buildHD() {
        computer.addPart("build hd");
    }

    public void buildSys() {
        computer.addPart("build sys");
    }

    public Computer getComputer() {
        return computer;
    }
}
