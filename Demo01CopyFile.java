package Demo13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\Vivien\\Daiyuan\\factory.jpg");
        FileOutputStream fos = new FileOutputStream("D:\\Vivien\\factory.jpg");
/*        int len = 0;
        while((len=fis.read())!=-1){
            fos.write(len);
        }*/
        //以上方法一个一个复制过慢
        byte[] b = new byte[1024];
        int len = 0;
        while((len=fis.read(b))!=-1){
            fos.write(b);
        }
        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }
}
