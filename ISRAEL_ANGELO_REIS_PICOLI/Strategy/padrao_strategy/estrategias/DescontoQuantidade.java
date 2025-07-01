package estrategias;

import itens.Cliente;
import itens.Produto;

public class DescontoQuantidade implements Desconto {
    @Override
    public double calcularDesconto(Cliente cliente, Produto produto, int quantidade) {
        if (quantidade >= 5) {
            return produto.getPreco() * 0.15; // 15%
        }
        return 0;
    }
}
