package API;
/*
* food operator class:
* responsible for putting food on menu and browsing menu*/

import java.util.ArrayList;
import java.util.Scanner;

public class FoodOperator {
    //1. define an arraylist collection object to store food object info
    private ArrayList<Food> foodList = new ArrayList<>();
    // foodList = []

    // 2. develop function: shelf food
    public void addFood(){
        // 3. create a food object, encapsulate shelf'd food info
        Food f = new Food();

        // 4. enter food info
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        System.out.println("Please enter food name: ");
        String name = sc.next();
        f.setName(name);

        System.out.println("Please enter food price: ");
        double price = sc.nextDouble();
        f.setPrice(price);

        System.out.println("Please enter food description: ");
        String desc = sc.next();
        f.setDesc(desc);

        // 5. put food object to collections
        foodList.add(f);
        System.out.println("Food is put to menu successfully!");
    }

    // 6. display menu
    public void showAllFoods(){
        if(foodList.size() == 0){
            System.out.println("No food in menu! Please shelf food first!");
            return;
        }
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            System.out.println(f.getName());
            System.out.println(f.getPrice());
            System.out.println(f.getDesc());
        }
    }

    // show operator interface
    public void start(){
        while (true) {
            System.out.println("Please select 1 or 2: ");
            System.out.println("1. adding food to menu");
            System.out.println("2. show menu");
            System.out.println("3. exit");

            Scanner sc = new Scanner(System.in);
            String command = sc.next();
            switch (command){
                case "1":
                    addFood();
                    break;
                case "2":
                    showAllFoods();
                    break;
                case "3":
                    System.out.println("Please come next time!");
                    return; // stop the entire start method!
                default:
                    System.out.println("The command you entered does not exist!");
            }
        }
    }
}
