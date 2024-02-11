package Demo09;

public class Demo01Extends {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.num);

        Teacher teacher = new Teacher();
        teacher.method();
        System.out.println(teacher.num);
        teacher.methodZi();
        teacher.methodFu();

        Assistant assistant = new Assistant();
        assistant.method();


    }
}
