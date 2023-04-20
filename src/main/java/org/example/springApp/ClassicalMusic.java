package org.example.springApp;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Classic";
    }

    @Override
    public String toString() {
        return getSong();
    }
}
