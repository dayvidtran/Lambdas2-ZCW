import org.junit.Test;

import java.util.ArrayList;

public class TestLocal {

    @Test
    public void testPersonChecker(){
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Fred", Person.Sex.MALE, "wethebest@hotmail.com"));
        people.add(new Person("Suzie", Person.Sex.FEMALE, "wethebest1@hotmail.com"));
        people.add(new Person("Doug", Person.Sex.MALE, "wethebest2@hotmail.com"));
    }

}
