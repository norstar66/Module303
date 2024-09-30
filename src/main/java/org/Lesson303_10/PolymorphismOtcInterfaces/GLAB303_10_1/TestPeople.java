package org.Lesson303_10.PolymorphismOtcInterfaces.GLAB303_10_1;

public class TestPeople {
    public static void main(String[] args) {
        Person aPerson;
        Boy jimmy;
        Girl betty;
        NonBinary joeDee;
        aPerson = new Person("Fred");
        jimmy = new Boy();
        betty = new Girl("Betty");
        joeDee = new NonBinary("Joe Dee");

        System.out.println(aPerson);
        System.out.println(aPerson.talk());
        System.out.println(aPerson.walk());
        System.out.println();

        System.out.println(jimmy);
        System.out.println(jimmy.talk());
        System.out.println(jimmy.walk());
        System.out.println();

        System.out.println(betty);
        System.out.println(betty.talk());
        System.out.println(betty.walk());
        System.out.println();

        System.out.println(joeDee);
        System.out.println(joeDee.talk());
        System.out.println(joeDee.walk());
        System.out.println();

        System.out.println((Person)jimmy);
        System.out.println(new Person(jimmy.talk()));
        System.out.println(new Person(jimmy.walk()));

        System.out.println();

        System.out.println((Person)betty);
        System.out.println(((Person)betty).talk());
        System.out.println(((Person)betty).walk());
        System.out.println();

        System.out.println((Person)joeDee);
        System.out.println(((Person)joeDee).talk());
        System.out.println(((Person)joeDee).walk());
        System.out.println();

        System.out.println(Person.lifeSpan());
        System.out.println(Boy.lifeSpan());
        System.out.println(Girl.lifeSpan());
        System.out.println(NonBinary.lifeSpan());

        System.out.println(((Boy)aPerson).talk());
    }
}
