// DECORATOR DE MODO RUIM //

// classe que representa um pedido com opções fixas de adicionais
class Pedido {
  private valorBase: number; // valor base do pedido
  private incluirFrete: boolean; // flag para adicionar frete
  private incluirPresente: boolean; // flag para adicionar embalagem para presente
  private incluirSeguro: boolean; // flag para adicionar seguro

  // construtor que recebe o valor base e as opcoes de adicionais
  constructor(
    valorBase: number,
    incluirFrete: boolean,
    incluirPresente: boolean,
    incluirSeguro: boolean
  ) {
    this.valorBase = valorBase;
    this.incluirFrete = incluirFrete;
    this.incluirPresente = incluirPresente;
    this.incluirSeguro = incluirSeguro;
  }

  // metodo que calcula o total do pedido com base nas opcoes escolhidas
  calcularTotal(): number {
    let total = this.valorBase;

    if (this.incluirFrete) {
      total += 20;
    }

    if (this.incluirPresente) {
      total += 10;
    }

    if (this.incluirSeguro) {
      total += 15;
    }

    return total;
  }

  // metodo que retorna uma descricao textual do pedido e dos adicionais
  descrever(): string {
    let descricao = `Pedido base de R$ ${this.valorBase.toFixed(2)}`;

    if (this.incluirSeguro) {
      descricao += ` + Seguro R$ 15.00`;
    }

    if (this.incluirPresente) {
      descricao += ` + Embalagem para Presente R$ 10.00`;
    }

    if (this.incluirFrete) {
      descricao += ` + Frete Expresso R$ 20.00`;
    }

    return descricao;
  }
}

// cria um pedido com todos os adicionais incluidos
const pedido = new Pedido(100, true, true, true);

// imprime a descricao e o total final do pedido
console.log(pedido.descrever());
console.log(`Total: R$ ${pedido.calcularTotal().toFixed(2)}`);

// DECORATOR DE MODO BOM //

// interface base que define o contrato de um pedido
interface PedidoDois {
  calcularTotal(): number; // metodo que retorna o valor total
  descrever(): string; // metodo que retorna a descricao do pedido
}

// implementacao simples de um pedido com valor base
class PedidoSimples implements PedidoDois {
  constructor(private valorBase: number) {} // armazena o valor base do pedido

  calcularTotal(): number {
    return this.valorBase; // retorna o valor base
  }

  descrever(): string {
    return `Pedido base de R$ ${this.valorBase.toFixed(2)}`; // descricao inicial
  }
}

// classe abstrata que serve de base para os decoradores de pedido
abstract class PedidoDecorator implements PedidoDois {
  constructor(protected componente: PedidoDois) {} // recebe o componente a ser decorado

  abstract calcularTotal(): number; // metodo abstrato para calcular o total
  abstract descrever(): string; // metodo abstrato para descrever o pedido
}

// decorador que adiciona o custo de frete expresso ao pedido
class FreteExpresso extends PedidoDecorator {
  calcularTotal(): number {
    return this.componente.calcularTotal() + 20; // adiciona R$ 20 ao total
  }

  descrever(): string {
    return `${this.componente.descrever()} + Frete Expresso R$ 20.00`; // adiciona descricao do frete
  }
}

// decorador que adiciona o custo de embalagem para presente
class EmbalagemPresente extends PedidoDecorator {
  calcularTotal(): number {
    return this.componente.calcularTotal() + 10; // adiciona R$ 10 ao total
  }

  descrever(): string {
    return `${this.componente.descrever()} + Embalagem para Presente R$ 10.00`; // adiciona descricao da embalagem
  }
}

// decorador que adiciona seguro ao pedido
class SeguroPedido extends PedidoDecorator {
  calcularTotal(): number {
    return this.componente.calcularTotal() + 15; // adiciona R$ 15 ao total
  }

  descrever(): string {
    return `${this.componente.descrever()} + Seguro R$ 15.00`; // adiciona descricao do seguro
  }
}

// cria um pedido simples de valor R$ 100,00
const pedidoDois = new PedidoSimples(100);

// aplica os decoradores seguro, embalagem e frete
const pedidoFinal = new FreteExpresso(
  new EmbalagemPresente(new SeguroPedido(pedidoDois))
);

// imprime a descricao e o total final do pedido
console.log(pedidoFinal.descrever());
console.log(`Total: R$ ${pedidoFinal.calcularTotal().toFixed(2)}`);
