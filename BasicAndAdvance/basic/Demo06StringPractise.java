package demo07;

public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        String str = fromArraytoString(array);
        System.out.println(str);
    }

    public static String fromArraytoString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                str += "word" + array[i] + "]";
            }else{
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }
}
