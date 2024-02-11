package Demo08;

public class Demo05MathPractise {
    public static void main(String[] args) {
        int count = 0;
        double min = -10.8;
        double max = 5.9;
        for(double i = Math.ceil(min); i <max; i++){
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total integer: " + count);
    }
}
