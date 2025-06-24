public class CalculadoraSemPattern {
    
    public static void main(String[] args) {
        // Testando diferentes operações
        double resultado1 = calcular(10, 5, "somar");
        System.out.println("10 + 5 = " + resultado1);
        
        double resultado2 = calcular(10, 5, "subtrair");
        System.out.println("10 - 5 = " + resultado2);
        
        double resultado3 = calcular(10, 5, "multiplicar");
        System.out.println("10 * 5 = " + resultado3);
        
        double resultado4 = calcular(10, 5, "dividir");
        System.out.println("10 / 5 = " + resultado4);
        
        double resultado5 = calcular(10, 0, "dividir");
        System.out.println("10 / 0 = " + resultado5);
    }
    
    // Método com switch/case - difícil de estender
    public static double calcular(double a, double b, String operacao) {
        switch (operacao.toLowerCase()) {
            case "somar":
                return a + b;
            case "subtrair":
                return a - b;
            case "multiplicar":
                return a * b;
            case "dividir":
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    return 0;
                }
            default:
                System.out.println("Operação desconhecida: " + operacao);
                return 0;
        }
    }
}