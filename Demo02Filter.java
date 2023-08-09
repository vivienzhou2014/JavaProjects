package Demo13;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo02Filter {

    public static void main(String[] args) {
        File file = new File("D:\\Vivien\\Daiyuan");
        getAllFile(file);
    }

    public static void getAllFile(File dir){
        /*File[] files = dir.listFiles(new FileFilter(){
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith("pdf");
            }
        });*/
/*        File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith("jpg");
            }
        });*/
/*        File[] files = dir.listFiles((File direc, String name)-> {
                return new File(direc,name).isDirectory() || name.toLowerCase().endsWith("jpg");
            }
        );*/
        File[] files = dir.listFiles((direc, name)-> new File(direc,name).isDirectory() || name.toLowerCase().endsWith("jpg"));
        for (File f : files) {
            if(f.isDirectory()){
                getAllFile(f);
            }else{
                System.out.println(f);
            }

        }
    }
}
