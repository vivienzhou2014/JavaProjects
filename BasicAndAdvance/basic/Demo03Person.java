package demo03;

public class Demo03Person {

    public static void main(String[] args) {
        Person person = new Person();
        person.show();

        person.name = "Angela";
//        person.age = -20;
        person.setAge(-20);
        person.show();
    }
}
