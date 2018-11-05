package sbt.java.person;

public interface Person {
    boolean marry(Person person);

    boolean divorce();

    Person getSpouse();

    boolean getSex();

    String getName();
}
