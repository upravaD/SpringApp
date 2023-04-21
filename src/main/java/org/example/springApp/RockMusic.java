package org.example.springApp;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Rock";
    }

    @Override
    public void init() {
        System.out.println("Initialization " + this.getClass().getSimpleName() + " complete!");
        TestSpring.COUNT++;
    }
}