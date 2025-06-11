package MARCUS_VINICIUS_GIORDANI_DE_SANT_ANNA.design_pattern.questao_um;

public class Main {
    public static void main(String[] args) {
        Bebida cafe = new CafeSimples();
        cafe = new Leite(cafe);
        cafe = new Chantilly(cafe);

        System.out.println("Descrição: " + cafe.getDescricao());
        System.out.println("Custo: R$ " + cafe.getCusto());
    }
}
