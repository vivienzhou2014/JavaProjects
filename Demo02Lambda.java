package Demo01FunctionalInterface;

public class Demo02Lambda {
    public static void showLog(int level, MessageBuilder mb){
        if(level==1){
            System.out.println(mb.builderMessage());
        }
    }

    public static void main(String[] args) {
        String msg1 = "Hello";
        String msg2 = "World";
        String msg3 = "Java";

        showLog(2,()->msg1+msg2+msg3);
    }

}
