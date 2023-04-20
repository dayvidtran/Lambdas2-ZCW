import java.time.LocalDate;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Sex gender;
    String emailAddress;

    public Person(String name, Sex male, String emailAddress) {
        this.name = name;
    }

    public int getAge() {
        // ...
        return 0;
    }

    public String printPerson() {
        System.out.println(toString());
        return toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}

