import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result = a % 400 == 0 ? 1 : (a % 100 == 0? 0 : (a % 4 == 0? 1 : 0));
        System.out.println(result);
    }
}