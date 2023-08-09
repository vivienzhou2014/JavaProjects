package Demo13;

import java.io.File;

public class Demo05Recurison {
    public static void main(String[] args) {
        File file = new File("D:\\Vivien\\Daiyuan");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        File[] files = dir.listFiles();
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                if(f.getName().toLowerCase().endsWith("pdf")){
                    System.out.println(f);
                }

            }

        }
    }
}
