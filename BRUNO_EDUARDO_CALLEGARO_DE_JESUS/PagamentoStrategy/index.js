
class CartaoStrategy {
  pagar(valor) {
    console.log(`Pagando R$ ${valor} no Cartão.`);
  }
}

class DinheiroStrategy {
  pagar(valor) {
    console.log(`Pagando R$ ${valor} em Dinheiro.`);
  }
}

class PixStrategy {
  pagar(valor) {
    console.log(`Pagando R$ ${valor} via PIX.`);
  }
}


class Pagamento {
  constructor(strategy) {
    this.strategy = strategy;
  }

  setStrategy(strategy) {
    this.strategy = strategy;
  }

  pagar(valor) {
    this.strategy.pagar(valor);
  }
}


const pagamento = new Pagamento(new CartaoStrategy());
pagamento.pagar(100);

pagamento.setStrategy(new DinheiroStrategy());
pagamento.pagar(50);

pagamento.setStrategy(new PixStrategy());
pagamento.pagar(75);
