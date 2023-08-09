package Demo13;

import java.io.*;

public class Demo04GBKtoUTF8 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter og = new OutputStreamWriter(new FileOutputStream("src\\Demo13\\b_gbk.txt"),"gbk");
        og.write("你好hello");
        og.close();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("src\\Demo13\\b_gbk.txt"),"gbk");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("src\\Demo13\\b_utf.txt"),"utf-8");
        int len = 0;
        while((len=isr.read())!=-1){
            osw.write(len);
        }
        isr.close();
        osw.close();
    }
}
