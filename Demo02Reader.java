package Demo13;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("src\\Demo13\\a.txt");
        //int len = fr.read();
        int len = 0;
/*        while((len=fr.read())!=-1){
            System.out.print((char) len);
        }*/
        char[] b = new char[1024];
        while((len=fr.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }

        fr.close();
    }
}
