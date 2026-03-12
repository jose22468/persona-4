import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] resultados = new String[n];

        for (int i = 0; i < n; i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b)
            {
                resultados[i] = "=";
            } else if (a > b)
            {
                resultados[i] = ">";
            } else {
                resultados[i] = "<";
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(resultados[i]);
        }
    }
}
