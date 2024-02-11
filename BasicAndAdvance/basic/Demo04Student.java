package demo03;

public class Demo04Student {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.setName("Luhan");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("name: " + stu.getName());
        System.out.println("age: " + stu.getAge());
        System.out.println("male? " + stu.isMale());
    }
}
