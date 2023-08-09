package Demo13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src\\Demo13\\a.txt", true);
        fos.write(97);
        byte[] bytes = {-65, 66, 67, 68, 69};
        fos.write(bytes);
        fos.write(bytes,2,2);
        fos.write("\r\n".getBytes());
        byte[] bytes2 = "hello".getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);

        fos.close();
    }
}
