
class Pagamento {
    pagar(valor) {
        throw new Error("Método pagar() deve ser implementado.");
    }
}


class Cartao extends Pagamento {
    pagar(valor) {
        console.log(`Pagando R$ ${valor} no Cartão.`);
    }
}

class Dinheiro extends Pagamento {
    pagar(valor) {
        console.log(`Pagando R$ ${valor} em Dinheiro.`);
    }
}

class Pix extends Pagamento {
    pagar(valor) {
        console.log(`Pagando R$ ${valor} via PIX.`);
    }
}


class PagamentoFactory {
    criarPagamento(metodo) {
        switch (metodo) {
            case "cartao":
                return new Cartao();
            case "dinheiro":
                return new Dinheiro();
            case "pix":
                return new Pix();
            default:
                throw new Error("Método de pagamento inválido.");
        }
    }
}


const factory = new PagamentoFactory();

const pagamento1 = factory.criarPagamento("cartao");
pagamento1.pagar(100);

const pagamento2 = factory.criarPagamento("dinheiro");
pagamento2.pagar(50);

const pagamento3 = factory.criarPagamento("pix");
pagamento3.pagar(75);
