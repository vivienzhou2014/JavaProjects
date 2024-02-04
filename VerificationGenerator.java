package Cases;

import java.util.Random;

public class VerificationGenerator {
    /*analysing:
    * 1. does this method receive data? receive an integer to control the length of verification code
    * 2. does this method return data? return generated verification code
    * 3. logic within the method: using for loop to generate random character for every digit
    *    then using a string variable to connect each character, return this variable*/
    public static void main(String[] args) {
        System.out.println(createCode(5));
    }

    public static String createCode(int n){
        Random r = new Random();
        String code = "";
        for (int i = 0; i < n; i++) {
            int type = r.nextInt(3);
            switch (type){
                case 0:
                    code += r.nextInt(10);
                    break;
                case 1:
                    char ch1 =(char)(r.nextInt(26) + 65);
                    code += ch1;
                    break;
                case 2:
                    char ch2 = (char)(r.nextInt(26) + 97);
                    code += ch2;
                    break;
            }
        }
        return code;
    }
}
