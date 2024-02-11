package demo06;

import java.util.ArrayList;
import java.util.Random;

public class Demo08ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> listA = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            listA.add(num);
        }
        ArrayList<Integer> listB = getSmallList(listA);
        for (int i = 0; i < listB.size(); i++) {
            System.out.println(i +" " + listB.get(i));
        }

    }
    public static ArrayList<Integer> getSmallList(ArrayList<Integer> list){
        ArrayList<Integer> listB = new ArrayList<>();
        for (int i = 0; i < list.size(); i++){
            int snum = list.get(i);
            if(list.get(i) % 2 == 0){
                listB.add(snum);
            }
        }
        return listB;
    }

}
