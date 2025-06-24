// Interface para todas as formas
interface Forma {
    void desenhar();
}

// Implementações concretas
class Circulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Círculo: O");
    }
}

class Quadrado implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Quadrado: □");
    }
}

class Triangulo implements Forma {
    @Override
    public void desenhar() {
        System.out.println("Desenhando um Triângulo: △");
    }
}

// Factory Method
class FormaFactory {
    public static Forma criarForma(String tipo) {
        switch (tipo.toLowerCase()) {
            case "circulo":
                return new Circulo();
            case "quadrado":
                return new Quadrado();
            case "triangulo":
                return new Triangulo();
            default:
                throw new IllegalArgumentException("Forma desconhecida: " + tipo);
        }
    }
}

// Classe principal
public class FormasGeometricasComPattern {
    public static void main(String[] args) {
        try {
            // Usando o Factory Method
            Forma forma1 = FormaFactory.criarForma("circulo");
            Forma forma2 = FormaFactory.criarForma("quadrado");
            Forma forma3 = FormaFactory.criarForma("triangulo");
            
            // Desenhando as formas
            forma1.desenhar();
            forma2.desenhar();
            forma3.desenhar();
            
            // Tentando criar forma não suportada
            Forma forma4 = FormaFactory.criarForma("hexagono");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}