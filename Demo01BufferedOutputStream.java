package Demo13;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        //1.create FileOutputStream object
        FileOutputStream fos = new FileOutputStream("src\\Demo13\\buffered.txt");
        //2.create BufferedOutputStream object
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //write
        bos.write("I am writing into buffered area".getBytes());
        bos.close();
    }
}
