import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestLocal {

    @Test
    public void testPersonChecker(){
        ArrayList<Person> people = new ArrayList<>();
        Person p = new Person("Fred", Person.Sex.MALE, "wethebest@hotmail.com");
        people.add(p);
        people.add(new Person("Suzie", Person.Sex.FEMALE, "wethebest1@hotmail.com"));
        people.add(new Person("Lucy", Person.Sex.FEMALE, "wethebest2@hotmail.com"));

        String expected =p.printPerson() + "\n";

        String actual = PersonService.printPersons(people, new PersonChecker());

        Assert.assertEquals(expected,actual);
    }

}
