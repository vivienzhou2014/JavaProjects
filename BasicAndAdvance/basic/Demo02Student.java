package demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        Student stu1 = new Student("Ali", 38);
        System.out.println("age : " + stu1.getAge() + " name : " + stu1.getName());
    }
}
