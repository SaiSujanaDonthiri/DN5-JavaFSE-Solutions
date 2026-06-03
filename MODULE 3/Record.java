import java.util.List;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class Record{
    public static void main(String[] args) {
        Person p1 = new Person("Rahul", 20);
        Person p2 = new Person("Amit", 17);
        Person p3 = new Person("Priya", 22);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<Person> people = List.of(p1, p2, p3);
        List<Person> adults =
                people.stream()
                      .filter(p -> p.age() >= 18)
                      .collect(Collectors.toList());
        System.out.println("Adults:");
        System.out.println(adults);
    }
}