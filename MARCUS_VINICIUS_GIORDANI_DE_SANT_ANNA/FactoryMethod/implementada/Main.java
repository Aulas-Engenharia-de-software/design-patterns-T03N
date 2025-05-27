package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.FactoryMethod.implementada;

public class Main {
    public static void main(String[] args) {
        ReceitaFactory doceFactory = new DoceFactory();
        ReceitaFactory fitnessFactory = new FitnessFactory();
        ReceitaFactory tradicionalFactory = new TradicionalFactory();

        Receita receita1 = doceFactory.criarReceita();
        Receita receita2 = fitnessFactory.criarReceita();
        Receita receita3 = tradicionalFactory.criarReceita();

        receita1.preparar();
        receita2.preparar();
        receita3.preparar();
    }
}
