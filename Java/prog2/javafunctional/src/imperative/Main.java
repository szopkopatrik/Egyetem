package imperative;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Gender.MALE),
                new Person("Maria", Gender.FEMALE),
                new Person("Aisha", Gender.FEMALE),
                new Person("Alex", Gender.MALE),
                new Person("Alice", Gender.FEMALE)
                );
        //imperative approach
        List<Person> females = new ArrayList<>();
        System.out.println("imperative approach");
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println("Declarative approach");
        //Declarative approach
        people.stream().filter(person -> Gender.FEMALE.equals(person.gender))
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
        static class Person {
            private final String name;
            private  final Gender gender;

            Person(String name,Gender gender) {
                this.name = name;
                this.gender = gender;
            }

            public String toString() {
                return "Person{" + "name='" + name + "/'" + ", gender=" + gender + '}';
            }
        }


}
