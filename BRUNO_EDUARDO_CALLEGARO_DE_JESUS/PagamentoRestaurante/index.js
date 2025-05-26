
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
    criarPagamento() {
        throw new Error("Método criarPagamento() deve ser implementado.");
    }
}


class CartaoFactory extends PagamentoFactory {
    criarPagamento() {
        return new Cartao();
    }
}

class DinheiroFactory extends PagamentoFactory {
    criarPagamento() {
        return new Dinheiro();
    }
}

class PixFactory extends PagamentoFactory {
    criarPagamento() {
        return new Pix();
    }
}


const cartaoFactory = new CartaoFactory();
const pagamentoCartao = cartaoFactory.criarPagamento();
pagamentoCartao.pagar(100);

const dinheiroFactory = new DinheiroFactory();
const pagamentoDinheiro = dinheiroFactory.criarPagamento();
pagamentoDinheiro.pagar(50);

const pixFactory = new PixFactory();
const pagamentoPix = pixFactory.criarPagamento();
pagamentoPix.pagar(75);
