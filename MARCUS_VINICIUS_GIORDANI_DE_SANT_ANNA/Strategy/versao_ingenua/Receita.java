package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.Strategy.versao_ingenua;

public class Receita {
    public void mostrarPassos(String nivel) {
        if (nivel.equalsIgnoreCase("iniciante")) {
            System.out.println("Passo 1: Separe os ingredientes. Passo 2: Misture. Passo 3: Asse.");
        } else if (nivel.equalsIgnoreCase("intermediario")) {
            System.out.println("Use técnica de mise en place e combine ingredientes por etapas.");
        } else if (nivel.equalsIgnoreCase("avancado")) {
            System.out.println("Aplique cocção a seco, controle de temperatura e técnicas avançadas.");
        } else {
            System.out.println("Nível não reconhecido.");
        }
    }
}