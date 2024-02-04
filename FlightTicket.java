package Cases;

public class FlightTicket {
    public static void main(String[] args) {
        double price = calculate(1000, 8, "economy class");
        System.out.println("Discounted price is: " + price);
    }
    public static double calculate(double price, int month, String type){
        if(month >= 5 && month <= 10){
            switch (type){
                case "first class":
                    price = price * 9;
                    break;
                case "economy class":
                    price *= 0.85;
                    break;
            }
        }else{
            switch (type){
                case "first class":
                    price *= 0.7;
                    break;
                case "economy class":
                    price *= 0.65;
                    break;
            }
        }
        return price;
    }
}
