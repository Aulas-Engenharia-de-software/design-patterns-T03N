package estrategias;

import itens.Cliente;
import itens.Produto;

public class DescontoClube implements Desconto {
    @Override
    public double calcularDesconto(Cliente cliente, Produto produto, int quantidade) {
        if ("Clube".equalsIgnoreCase(cliente.getNivel())) {
            return produto.getPreco() * 0.05; // 5%
        }
        return 0;
    }
}
