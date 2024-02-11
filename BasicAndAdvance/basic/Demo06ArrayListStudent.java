package demo06;

import java.util.ArrayList;

public class Demo06ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("Jade", 20);
        Student two = new Student("Jude", 28);
        Student three = new Student("Luke", 32);
        Student four = new Student("Ali", 27);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("Name: " + stu.getName() + " Age: " + stu.getAge());
        }
    }
}
