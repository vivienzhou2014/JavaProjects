package API;

import java.util.ArrayList;

public class ArrayListMenu {
    public static void main(String[] args) {
        // target: mimic creating menu
        // 1. desing a food class to create food object, encapsulate food data
        // 2. design a food operator class to complete business realization: put food on menu, browse menu
        FoodOperator operator = new FoodOperator();
        operator.start();
    }
}
