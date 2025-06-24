public class FormasGeometricasSemPattern {
    
    public static void main(String[] args) {
        // Criando formas de maneira ingênua
        String forma1 = "circulo";
        String forma2 = "quadrado";
        String forma3 = "triangulo";
        
        // Desenhando cada forma com if/else
        desenharForma(forma1);
        desenharForma(forma2);
        desenharForma(forma3);
        desenharForma("hexagono"); // Forma não suportada
    }
    
    // Método com vários if/else - difícil de manter
    public static void desenharForma(String tipo) {
        if (tipo.equals("circulo")) {
            System.out.println("Desenhando um Círculo: O");
        } else if (tipo.equals("quadrado")) {
            System.out.println("Desenhando um Quadrado: □");
        } else if (tipo.equals("triangulo")) {
            System.out.println("Desenhando um Triângulo: △");
        } else {
            System.out.println("Forma desconhecida: " + tipo);
        }
    }
}