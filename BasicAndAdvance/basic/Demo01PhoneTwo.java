package cn.itcast.day04.demo04;

public class Demo01PhoneTwo {

    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.brand = "Apple";
        one.price = 8388.0;
        one.color = "Black";
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        one.call("Jobs");
        one.sendMessage();

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.brand = "Huawei";
        two.price = 5955.0;
        two.color = "Blue";
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        two.call("Ren");
        two.sendMessage();

    }
}
