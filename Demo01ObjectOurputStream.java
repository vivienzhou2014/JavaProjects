package Demo14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOurputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Demo14\\person.txt"));
        oos.writeObject(new Person("Alice", 18));
        oos.close();
    }
}
