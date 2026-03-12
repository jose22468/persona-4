import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();

        int resultado = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > h) {
                resultado += 2;
            } else {
                resultado += 1;
            }
        }

        System.out.println(resultado);
    }
}