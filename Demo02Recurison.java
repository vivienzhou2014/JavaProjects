package Demo13;

public class Demo02Recurison {
    public static void main(String[] args) {
        System.out.println(time(5));
    }

    private static int add(int n) {
        int a=n;
        if(n>0){
            n--;
            a += add(n);
        }
        return a;
    }

    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }

    public static int time(int n){
        if(n==1){
            return 1;
        }
        return n*time(n-1);
    }
}
