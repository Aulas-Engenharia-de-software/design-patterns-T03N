package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.FactoryMethod.versao_ingenua;

public class Main {
    public static void main(String[] args) {
        ChefLearn chef = new ChefLearn();

        Receita receita1 = chef.criarReceita("doce");
        Receita receita2 = chef.criarReceita("fitness");
        Receita receita3 = chef.criarReceita("tradicional");

        receita1.preparar();
        receita2.preparar();
        receita3.preparar();
    }
}
