package Demo13;

import java.io.*;
import java.util.HashMap;
import java.util.Properties;

public class Demo05SortText {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hm = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("src\\Demo13\\buffered.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\Demo13\\bufferedOut.txt"));
        String line = "";
        while((line = br.readLine())!=null){
            /*Properties prop = new Properties();
            prop.load(line);*/
            String[] arr = line.split("\\.");
            hm.put(arr[0],arr[1]);
        }
        for(String key : hm.keySet()){
            String value = hm.get(key);
            line = key + "." + value;
            bw.write(line);
            bw.newLine();
        }
        bw.close();
        br.close();
        }
}
