package equalsAndHashcode;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("asfdsf", 10, "a");
        Person person2 = new Person("asfdsf", 10, "a");
        System.out.println(person.equals(person2));
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());

        Map<Person, Integer> map = new HashMap<>();
        map.put(new Person("Alex", 14, "123213"), 1);
        map.put(new Person("Ben", 45, "567567"), 2);
        map.put(new Person("Jenny", 34, "235345"), 3);
        Person person3 = new Person("Alex", 14, "123213");
        System.out.println(map.get(person3)); // если не переопределили хэш код то мы не смогли бы найти цифру


    }
}
