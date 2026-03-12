import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();
        int d3 = sc.nextInt();

        int suma = 0;
        int minimo = Integer.MAX_VALUE;

        for (int i = 1; i <= 6; i++)
        {
            suma = 0;

            if (i == 1)
            {

                suma = suma + d1;
                suma = suma + d3;
                suma = suma + d2;
            }

            if (i == 2)
            {

                suma = suma + d2;
                suma = suma + d3;
                suma = suma + d1;
            }

            if (i == 3)
            {

                suma = suma + d1;
                suma = suma + d1;
                suma = suma + d2;
                suma = suma + d2;
            }

            if (i == 4)
            {

                suma = suma + d2;
                suma = suma + d2;
                suma = suma + d1;
                suma = suma + d1;
            }

            if (i == 5)
            {

                suma = suma + d1;
                suma = suma + d3;
                suma = suma + d3;
                suma = suma + d1;
            }

            if (i == 6)
            {

                suma = suma + d2;
                suma = suma + d3;
                suma = suma + d3;
                suma = suma + d2;
            }

            if (suma < minimo)
            {
                minimo = suma;
            }
        }

        System.out.println(minimo);
    }
}
