package Demo08;

import java.util.Arrays;

public class Demo04Practise {
    public static void main(String[] args) {
        String str = "sdgadkgjkdsjgkdahj";
        char[] array = str.toCharArray();
        //String[] array = {"saf", "afd", "dfss", "gdsg"};
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);

        }
    }
}
