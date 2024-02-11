package Demo08;

public class Demo01StaticField {
    public static void main(String[] args) {
        Student.room = "Room 101";
        Student one = new Student("Luke", 17);
        Student two = new Student("Alex", 20);

        System.out.println("Name: " + one.getName()
                + ", age: " + one.getAge() + ", Classroom: " + one.room
                + " Student ID: " + one.getId());
        System.out.println("Name: " + two.getName() +
                ", age: " + two.getAge() + ", Classroom: " + two.room
                + " Student ID: " + two.getId());
    }
}
