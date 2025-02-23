import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);

        // Pede ao usuário para inserir o valor da base do triângulo
        System.out.print("Digite o valor da base do triângulo: ");
        float base = Scanner.nextFloat();

        // Pede ao usuário para inserir o valor da altura do triângulo
        System.out.print("Digite o valor da altura do triângulo: ");
        float altura = Scanner.nextFloat();

        Triangulo triangulo = new Triangulo(base, altura); // Cria uma instância da classe triângulo

        System.out.println("O valor da área do triângulo é: " + triangulo.Area());
        System.out.println("O valor do perímetro do triângulo é: " + triangulo.Perimetro());

        // Fecha o scanner
        Scanner.close();
    }
}
