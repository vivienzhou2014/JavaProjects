package Cases;

public class EncryptNumber {
    /*a system has a four digit password, such as 1983, for safety concerns,
    * the password needs to be encrypted before transmitting. The encryption
    * rule is for every digit in the password, add 5 and then module 10, then
    * reverse the whole password*/

    /*analysis:
    * 1.receiving data? 4 digit password
    * 2.returning data? encrypted password
    * 3.logic: split the 4 digits password into one by one digit, store into array,
    *          iterate */
    public static void main(String[] args) {
        System.out.println("Encrypted result is: " + encrypt(1983));
    }

    public static String encrypt(int pw){
        // pw = 1983
        //1. split password into digit one by one
        int[] numbers = split(pw);
        // numbers = [1,9,8,3]

        //iterate each number in numbers to encrypt
        for (int i = 0; i < numbers.length; i++) {
            // i = 0 1 2 3
            numbers[i] = (numbers[i] + 5) % 10;
        }
        //numbers = [6, 4, 3, 8]

        //3. using an independent function to reverse the array
        reverse(numbers);
        // numbers = [8, 3, 4, 6]

        //4. concatenate numbers to String
        String data = "";
        for (int i = 0; i < numbers.length; i++) {
            data += numbers[i];
        }
        return data;
    }

    public static void reverse(int[] numbers) {
        //reverse array numbers
        //numbers = [6, 4, 3, 8]
        for (int i = 0, j = numbers.length - 1; i < j; i++,j--) {
            //swap value in i and j
            //1. store value in j at temporary variable temp
            int temp = numbers[j];
            //2. assign value in i to  j
            numbers[j] = numbers[i];
            // 3. assign temp to i
            numbers[i] = temp;
        }
    }

    public static int[] split(int pw) {
        // pw = 1983
        int[] numbers = new int[4];
        numbers[0] = pw / 1000;
        numbers[1] = (pw / 100) % 10;
        numbers[2] = (pw / 10) % 10;
        numbers[3] = pw % 10;
        return numbers;
    }
}
