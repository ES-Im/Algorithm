import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a > 0 ? (b > 0 ? 1 : 4) : (b > 0 ? 2 : 3);
        System.out.println(result);
    }
}




