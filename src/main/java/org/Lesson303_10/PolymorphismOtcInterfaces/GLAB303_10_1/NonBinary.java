package org.Lesson303_10.PolymorphismOtcInterfaces.GLAB303_10_1;

/**
 * I added this class just for fun...
 */
public class NonBinary extends Person {
    static double ageFactor = 1.2;
    public NonBinary(String aName) {
        name = "Rbl." + aName;
    }
    public String talk () {
        return (super.talk() + "...I love double Java. Coding with Coffee is fun.");
    }
    public String code () {
        return ("Happy coding!");
    }
}

