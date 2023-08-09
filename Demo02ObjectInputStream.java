package Demo14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Demo14\\person.txt"));
        System.out.println(ois.readObject().toString());
        //System.out.println(ois.readObject().toString());
        ois.close();
    }
}
