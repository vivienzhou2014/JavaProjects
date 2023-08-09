package Demo13;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("src\\Demo13\\b.txt",true);
        fw.write("\r\n");
        fw.write(97);
        fw.write("world");
        char[] cs = {'a','b','c'};
        fw.write(cs);
        fw.write(cs,0,2);
        fw.write("你好吗");
        //fw.flush();
        fw.close();
    }
}
