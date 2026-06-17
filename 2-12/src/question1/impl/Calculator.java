package question1.impl;

public interface Calculator {

    public static Calculator create() {
        return new Plus();
    }

    // ① 

}
