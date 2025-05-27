package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.FactoryMethod.implementada;

public class DoceFactory extends ReceitaFactory {
    public Receita criarReceita() {
        return new ReceitaDoce();
    }
}
