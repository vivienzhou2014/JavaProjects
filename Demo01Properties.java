package Demo13;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        show03();
    }

    private static void show03()  throws IOException{
        Properties prop = new Properties();

        prop.load(new FileReader("src\\Demo13\\prop.txt"));

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            //System.out.println(key+"="+ prop.getProperty(key));
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);

        }

    }

    private static void show02() throws IOException {
        Properties prop = new Properties();

        prop.setProperty("Alice", "168");
        prop.setProperty("Belle", "160");
        prop.setProperty("Cathy","165");

        FileWriter fw = new FileWriter("src\\Demo13\\prop.txt");

        prop.store(fw, "save data");

        fw.close();
    }

    private static void show01() {
        Properties prop = new Properties();

        prop.setProperty("Alice", "168");
        prop.setProperty("Belle", "160");
        prop.setProperty("Cathy","165");
       // prop.put(1,true);

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+"="+value);

        }


    }
}
