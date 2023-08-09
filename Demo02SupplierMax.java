package Demo01FunctionalInterface;

import java.util.Arrays;
import java.util.function.Supplier;

public class Demo02SupplierMax {
    public static int getMax(Supplier<Integer> i){
        return i.get();
    }

    public static void main(String[] args) {
        Integer[] in = {23,54,-120,35,26};
        int i = getMax(()->{
           /* Arrays.sort(in);
            return in[in.length-1];*/
            int max = in[0];
            for (Integer integer : in) {
                if(integer>max){
                    max=integer;
                }
            }
            return max;
        });
        System.out.println(i);
    }
}
