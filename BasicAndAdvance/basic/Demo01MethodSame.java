package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,10));
    }

    //boolean isSame int a, int b
    public static boolean isSame(int a, int b){
        /*boolean same;
        if(a == b) {
        same = true;
        } else{
        same = false;
        }
         */
        //boolean same = a == b; true : false;
        // boolean same = a == b;
        return a == b;
    }
}
