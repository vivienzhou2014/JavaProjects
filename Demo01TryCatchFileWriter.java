package Demo13;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatchFileWriter {
    public static void main(String[] args) throws IOException {
 /*       FileWriter fw = null;
        try{
            fw = new FileWriter("src\\Demo13\\b.txt",true);
            fw.write("\r\n");
            fw.write(97);
        }catch (IOException e){
            System.out.println(e);
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }*/

        //JDK7
/*        try(FileWriter fw = new FileWriter("src\\Demo13\\b.txt",true);){
            fw.write("\r\n");
            fw.write(97);
        }catch (IOException e){
            System.out.println(e);
        }*/

        FileWriter fw = new FileWriter("src\\Demo13\\b.txt",true);
        try(fw){
            fw.write("\r\n");
            fw.write(97);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
