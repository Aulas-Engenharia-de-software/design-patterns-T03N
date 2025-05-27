package itens_leigo;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto", "Clube"); // Para desconto de clube: "Clube"
        Produto produto = new Produto("Notebook", "Eletrônico", 3000.0); // Para desconto de categoria: "Eletrônico"
        int quantidade = 7; // Para desconto de quantidade: 5 ou maior

        double descontoCategoria = 0.0;
        double descontoQuantidade = 0.0;
        double descontoClube = 0.0;

        if ("Eletrônico".equalsIgnoreCase(produto.getCategoria())) {
            descontoCategoria = produto.getPreco() * 0.10;
        }
        if (quantidade >= 5) {
            descontoQuantidade = produto.getPreco() * 0.15;
        }
        if ("Clube".equalsIgnoreCase(cliente.getNivel())) {
            descontoClube = produto.getPreco() * 0.05;
        }

        double valorDesconto = descontoCategoria;

        String descontoEscolhido = "Categoria";

        if (descontoQuantidade > valorDesconto) {
            valorDesconto = descontoQuantidade;
            descontoEscolhido = "Quantidade";
        }
        if (descontoClube > valorDesconto) {
            valorDesconto = descontoClube;
            descontoEscolhido = "Clube";
        }
        if (valorDesconto == 0) {
            descontoEscolhido = "Nenhum";
        }

        double precoFinal = produto.getPreco() - valorDesconto;

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$" + produto.getPreco());
        System.out.println("Desconto aplicado: R$" + valorDesconto);
        System.out.println("\nMaior desconto escolhido: " + descontoEscolhido);
        System.out.println("Preço final: R$" + precoFinal);
    }
}