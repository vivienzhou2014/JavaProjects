package Demo13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src\\Demo13\\a.txt");
        //read each byte
        /*int len = 0;
        while((len= fis.read())!=-1){
            //len = fis.read();
            System.out.println(len);
        }*/
        //read the whole text, but you need to know the length first
        /*byte[] bytes = new byte[5];
        int l = fis.read(bytes);
        System.out.println(l);
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));*/
        //Use this when you dont want to count length
        byte[] b = new byte[1024];
        int len = 0;
        while((len=fis.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}
