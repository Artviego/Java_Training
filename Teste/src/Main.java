import java.util.Scanner;

public class Main
{
    public static void Main(String[] args)
    {
        int[] numeros = new int[4];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 4 valores inteiros para o vetor:");
        int numero = entrada.nextInt();

        for (int i : numeros)
        {
            System.out.println(numero);
        }
    }
}