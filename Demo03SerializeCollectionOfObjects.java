package Demo14;

import java.io.*;
import java.util.ArrayList;

public class Demo03SerializeCollectionOfObjects {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Object> ppl = new ArrayList<>();
        ppl.add(new Person("Alice", 18));
        ppl.add(new Person("Bruce",20));
        ppl.add(new Person("Carmen",24));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src\\Demo14\\PersonList.txt"));
        /*for (Object o : ppl) {
            oos.writeObject(o);
        }*/
        oos.writeObject(ppl);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src\\Demo14\\PersonList.txt"));
        //ArrayList<Object> ppl_read = new ArrayList<>();
        //System.out.println(ois.readObject().toString());
        //ppl_read.add(ois.readObject());
        Object o = ois.readObject();
        ArrayList<Person> list = (ArrayList<Person>)o;
        for (Person person : list) {
            System.out.println(person);
        }
        oos.close();
        ois.close();
    }
}
