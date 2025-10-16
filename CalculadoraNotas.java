import java.util.Scanner;

public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora de Média de Notas ===");
        
        // Declarar variáveis para as quatro notas
        double nota1, nota2, nota3, nota4;
        
        // Ler as quatro notas
        System.out.print("Digite a primeira nota: ");
        nota1 = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        nota2 = scanner.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        nota3 = scanner.nextDouble();
        
        System.out.print("Digite a quarta nota: ");
        nota4 = scanner.nextDouble();
        
        // Calcular a média dividindo por 4
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        // Imprimir o resultado no console
        System.out.println("\n=== Resultado ===");
        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Nota 3: %.2f\n", nota3);
        System.out.printf("Nota 4: %.2f\n", nota4);
        System.out.printf("Média: %.2f\n", media);
        
        scanner.close();
    }
}