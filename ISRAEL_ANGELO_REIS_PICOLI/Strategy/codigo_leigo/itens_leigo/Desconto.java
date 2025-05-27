package itens_leigo;

public class Desconto {
    public double calcularDesconto(Cliente cliente, Produto produto, int quantidade) {
        double descontoCategoria = 0.0;
        double descontoQuantidade = 0.0;
        double descontoClube = 0.0;

        // Desconto por categoria
        if ("Eletrônico".equalsIgnoreCase(produto.getCategoria())) {
            descontoCategoria = produto.getPreco() * 0.10; // 10%
        }

        // Desconto por quantidade
        if (quantidade >= 5) {
            descontoQuantidade = produto.getPreco() * 0.15; // 15%
        }

        // Desconto por clube
        if ("Clube".equalsIgnoreCase(cliente.getNivel())) {
            descontoClube = produto.getPreco() * 0.05; // 5%
        }

        // Retorna o maior desconto
        return Math.max(descontoCategoria, Math.max(descontoQuantidade, descontoClube));
    }
}