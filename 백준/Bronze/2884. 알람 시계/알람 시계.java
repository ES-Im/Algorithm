import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(b-45 >= 0) {
            b = b - 45;
        } else {
            a--;
            b = 60 + (b-45);
        }

        if(a == -1) {
            a = 23;
        }

        System.out.println(a + " " + b);
    }
}




