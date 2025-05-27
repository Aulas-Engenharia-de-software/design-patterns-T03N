package estrategias;

import itens.Cliente;
import itens.Produto;

public class DescontoCategoria implements Desconto {
    @Override
    public double calcularDesconto(Cliente cliente, Produto produto, int quantidade) {
        if (produto.getCategoria().equalsIgnoreCase("Eletrônico")) {
            return produto.getPreco() * 0.10; // 10%
        }
        return 0;
    }
}
