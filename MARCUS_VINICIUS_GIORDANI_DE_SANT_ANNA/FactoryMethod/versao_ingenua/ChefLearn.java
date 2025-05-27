package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.FactoryMethod.versao_ingenua;

public class ChefLearn {
    public Receita criarReceita(String tipo) {
        if (tipo.equalsIgnoreCase("doce")) {
            return new Receita("Bolo de chocolate");
        } else if (tipo.equalsIgnoreCase("fitness")) {
            return new Receita("Panqueca de aveia");
        } else {
            return new Receita("Arroz com feijão");
        }
    }
}
