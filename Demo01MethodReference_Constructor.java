package Demo02StreamAndMethodReference;

public class Demo01MethodReference_Constructor {
    public static void printName(String name, PersonBuilder pb){
        Person person = pb.builderPerson(name);
        System.out.println(person.getName());

    }

    public static void main(String[] args) {
        /*printName("Alice",(String name)->{
            return new Person(name);
        });*/
        printName("Alice", Person::new);
    }
}
