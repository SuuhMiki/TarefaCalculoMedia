public class CalculadoraMedia {
    private double[] notas;
    
    // Construtor que recebe as quatro notas
    public CalculadoraMedia(double nota1, double nota2, double nota3, double nota4) {
        this.notas = new double[4];
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
        this.notas[3] = nota4;
    }
    
    // Método para calcular a média
    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    
    // Método para obter uma nota específica
    public double getNota(int indice) {
        if (indice >= 0 && indice < notas.length) {
            return notas[indice];
        }
        return 0; // Retorna 0 se o índice for inválido
    }
    
    // Método para obter todas as notas
    public double[] getNotas() {
        return notas.clone(); // Retorna uma cópia para proteger o array original
    }
    
    // Método para exibir todas as informações formatadas
    public void exibirResultado() {
        System.out.println("\n=== Resultado ===");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: %.2f\n", (i + 1), notas[i]);
        }
        System.out.printf("Média: %.2f\n", calcularMedia());
    }
    
    // Método para verificar se o aluno foi aprovado (média >= 7.0)
    public boolean foiAprovado() {
        return calcularMedia() >= 7.0;
    }
    
    // Método para obter o conceito baseado na média
    public String getConceito() {
        double media = calcularMedia();
        if (media >= 9.0) {
            return "Excelente";
        } else if (media >= 8.0) {
            return "Muito Bom";
        } else if (media >= 7.0) {
            return "Bom";
        } else if (media >= 6.0) {
            return "Regular";
        } else {
            return "Insuficiente";
        }
    }
}