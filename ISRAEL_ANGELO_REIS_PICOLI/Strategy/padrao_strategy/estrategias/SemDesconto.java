package estrategias;

import itens.Cliente;
import itens.Produto;

public class SemDesconto implements Desconto {
    @Override
    public double calcularDesconto(Cliente cliente, Produto produto, int quantidade) {
        return 0;
    }
}
