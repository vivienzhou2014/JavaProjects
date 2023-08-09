package Demo13;

import java.io.*;

public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("D:\\Vivien\\Daiyuan\\factory.jpg");
        //FileOutputStream fos = new FileOutputStream("D:\\Vivien\\factory.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Vivien\\factory.jpg"));
        int len = 0;

        while((len=bis.read())!=-1){
            bos.write(len);
        }
        //不管是一个一个读取还是数组读取，都可以明显提升效率
        /*byte[] bytes = new byte[1024];
        while((len=bis.read(bytes))!=-1){
            bos.write(bytes);
        }*/
        bos.close();
        bis.close();
        long e = System.currentTimeMillis();
        System.out.println("复制文件共耗时"+(e-s)+"毫秒");
    }

}
