import itens.Cliente;
import itens.Produto;
import estrategias.Desconto;
import estrategias.DescontoCategoria;
import estrategias.DescontoQuantidade;
import estrategias.DescontoClube;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Roberto", "Clube"); // Para desconto de clube: "Clube"
        Produto produto = new Produto("Notebook", "Eletrônico", 3000.0); // Para desconto de categoria: "Eletrônico"
        int quantidade = 7; // Para desconto de quantidade: 5 ou maior

        Desconto descontoCategoria = new DescontoCategoria();
        Desconto descontoQuantidade = new DescontoQuantidade();
        Desconto descontoClube = new DescontoClube();

        double valorDescontoCategoria = descontoCategoria.calcularDesconto(cliente, produto, quantidade);
        double valorDescontoQuantidade = descontoQuantidade.calcularDesconto(cliente, produto, quantidade);
        double valorDescontoClube = descontoClube.calcularDesconto(cliente, produto, quantidade);

        double descontoAplicado = Math.max(
                valorDescontoCategoria,
                Math.max(valorDescontoQuantidade, valorDescontoClube));

        String descontoEscolhido;
        if (descontoAplicado == 0) {
            descontoEscolhido = "Nenhum";
        } else if (descontoAplicado == valorDescontoClube) {
            descontoEscolhido = "Clube";
        } else if (descontoAplicado == valorDescontoQuantidade) {
            descontoEscolhido = "Quantidade";
        } else if (descontoAplicado == valorDescontoCategoria) {
            descontoEscolhido = "Categoria";
        } else {
            descontoEscolhido = "Nenhum";
        }

        double precoFinal = produto.getPreco() - descontoAplicado;

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$" + produto.getPreco());
        System.out.println("Desconto aplicado: R$" + descontoAplicado);
        System.out.println("\nMaior desconto escolhido: " + descontoEscolhido);
        System.out.println("Preço final: R$" + precoFinal);

        // System.out.println("Desconto Clube: R$" + valorDescontoClube);
        // System.out.println("Desconto Quantidade: R$" + valorDescontoQuantidade);
        // System.out.println("Desconto Categoria: R$" + valorDescontoCategoria);
    }
}