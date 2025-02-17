import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 0;

        // Validação para garantir a entrada de um número válido
        while (true) {
            System.out.print("Digite o número de palavras que deseja inserir (uma frase será formada): ");
            if (scanner.hasNextInt()) {
                tamanho = scanner.nextInt();
                if (tamanho <= 0) {
                    System.out.println("O número deve ser maior que 0.");
                    continue;
                }
                break;
            } else {
                System.out.println("Por favor, insira um número válido.");
                scanner.next(); // Limpa a entrada inválida
            }
        }

        // Consumir quebra de linha residual
        scanner.nextLine();

        // Criando o array
        String[] palavras = new String[tamanho];

        // Preenche os valores com as palavras inseridas pelo usuário
        for (int i = 0; i < tamanho; i++) {
            System.out.println((i + 1) + "º palavra: ");
            palavras[i] = scanner.nextLine().trim(); // Lê a linha inteira e remove espaços extras
        }

        System.out.println("\nAs palavras inseridas foram: ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }

        String resultado = String.join(" ", palavras);
        System.out.println("\nA frase formada é: " + resultado);

        // Fecha o scanner para evitar futuros problemas
        scanner.close();
    }
}