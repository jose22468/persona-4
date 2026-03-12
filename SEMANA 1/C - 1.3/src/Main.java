import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        while (n != 0)
        {
            int[] cartas = new int[2 * n];
            int inicio = 0;
            int fin = n - 1;

            for (int i = 0; i < n; i++)
            {
                cartas[i] = i + 1;
            }

            int[] descartadas = new int[n];
            int d = 0;

            while (inicio < fin)
            {
                descartadas[d++] = cartas[inicio++];
                cartas[++fin] = cartas[inicio++];
            }

            int restante = cartas[inicio];

            System.out.print("Discarded cards:");
            for (int i = 0; i < d; i++)
            {
                if (i == 0)
                    System.out.print(" " + descartadas[i]);
                else
                    System.out.print(", " + descartadas[i]);
            }
            System.out.println();

            System.out.println("Remaining card: " + restante);

            n = input.nextInt();
        }
    }
}
