package util;

public class NumberGenerator {
    private int number;
    private final static NumberGenerator instance = new NumberGenerator();
    private NumberGenerator(){

    }
    public static NumberGenerator getInstance(){
        return instance;
    }
    public int generate(){
        return ++number;
    }



}
