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
        
        // Criar instância da classe CalculadoraMedia
        CalculadoraMedia calculadora = new CalculadoraMedia(nota1, nota2, nota3, nota4);
        
        // Exibir resultado usando os métodos da classe
        calculadora.exibirResultado();
        
        // Informações adicionais
        System.out.printf("Conceito: %s\n", calculadora.getConceito());
        System.out.printf("Situação: %s\n", calculadora.foiAprovado() ? "APROVADO" : "REPROVADO");
        
        scanner.close();
    }
}