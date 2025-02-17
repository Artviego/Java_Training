import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Criando o objeto scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Lendo o tamanho inserido pelo usuário
        System.out.print("Quantos números deseja inserir no vetor? ");
        int tamanho = scanner.nextInt();

        // Criando o array
        int numeros[] = new int[tamanho];

        // Usando um loop para receber os números inseridos pelo usuário
        System.out.println("Insira os números:");
        for (int i = 0; i < tamanho; i++)
        {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Usando foreach para imprimir os valores inseridos pelo usuário
        System.out.println("\nOs números inseridos foram: ");
        for (int numero : numeros)
        {
            System.out.println(numero);
        }

        // Fechando o scanner para evitar problemas com recursos
        scanner.close();
    }
}