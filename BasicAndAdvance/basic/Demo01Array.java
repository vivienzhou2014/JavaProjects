package demo06;

public class Demo01Array {

    public static void main(String[] args) {
        //int[] array = new int[3];
        Person[] array = new Person[3];
        //System.out.println(array[0]);
        /*
        Person one = new Person("Alice", 18);
        Person two = new Person("Mary", 28);
        Person three = new Person("Luke", 39);

        array[0] = one;
        array[1] = two;
        array[2] = three;

         */
        array[0] = new Person("Alice", 18);
        array[1] = new Person("Mary", 28);
        array[2] = new Person("Luke", 39);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());

        System.out.println(array[2].getName());

    }
}
