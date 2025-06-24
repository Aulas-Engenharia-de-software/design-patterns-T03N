// Interface Strategy
interface OperacaoStrategy {
    double calcular(double a, double b);
}

// Implementações concretas das estratégias
class Somar implements OperacaoStrategy {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}

class Subtrair implements OperacaoStrategy {
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}

class Multiplicar implements OperacaoStrategy {
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}

class Dividir implements OperacaoStrategy {
    @Override
    public double calcular(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
    }
}

// Contexto que usa a Strategy
class Calculadora {
    private OperacaoStrategy operacao;
    
    public void setOperacao(OperacaoStrategy operacao) {
        this.operacao = operacao;
    }
    
    public double executar(double a, double b) {
        if (operacao == null) {
            throw new IllegalStateException("Operação não definida!");
        }
        return operacao.calcular(a, b);
    }
}

// Classe principal
public class CalculadoraComPattern {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Testando soma
        calc.setOperacao(new Somar());
        System.out.println("10 + 5 = " + calc.executar(10, 5));
        
        // Testando subtração
        calc.setOperacao(new Subtrair());
        System.out.println("10 - 5 = " + calc.executar(10, 5));
        
        // Testando multiplicação
        calc.setOperacao(new Multiplicar());
        System.out.println("10 * 5 = " + calc.executar(10, 5));
        
        // Testando divisão
        calc.setOperacao(new Dividir());
        System.out.println("10 / 5 = " + calc.executar(10, 5));
        System.out.println("10 / 0 = " + calc.executar(10, 0));
    }
}