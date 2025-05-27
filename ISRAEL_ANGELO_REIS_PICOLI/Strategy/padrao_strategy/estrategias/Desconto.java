package estrategias;

import itens.Cliente;
import itens.Produto;

public interface Desconto {
    double calcularDesconto(Cliente cliente, Produto produto, int quantidade);
}
