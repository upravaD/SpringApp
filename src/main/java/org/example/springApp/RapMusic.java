package org.example.springApp;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "Rap";
    }

    @Override
    public void init() {
        System.out.println("Initialization " + this.getClass().getSimpleName() + " complete!");
        TestSpring.COUNT++;
    }
}
