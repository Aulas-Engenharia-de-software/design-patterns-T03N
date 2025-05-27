"use strict";
// DECORATOR DE MODO RUIM //
// classe que representa um pedido com opções fixas de adicionais
class Pedido {
    valorBase; // valor base do pedido
    incluirFrete; // flag para adicionar frete
    incluirPresente; // flag para adicionar embalagem para presente
    incluirSeguro; // flag para adicionar seguro
    // construtor que recebe o valor base e as opções de adicionais
    constructor(valorBase, incluirFrete, incluirPresente, incluirSeguro) {
        this.valorBase = valorBase;
        this.incluirFrete = incluirFrete;
        this.incluirPresente = incluirPresente;
        this.incluirSeguro = incluirSeguro;
    }
    // método que calcula o total do pedido com base nas opções escolhidas
    calcularTotal() {
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
    // método que retorna uma descrição textual do pedido e dos adicionais
    descrever() {
        let descricao = `Pedido base de R$ ${this.valorBase.toFixed(2)}`;
        if (this.incluirSeguro) {
            descricao += ` + Seguro (R$ 15.00)`;
        }
        if (this.incluirPresente) {
            descricao += ` + Embalagem para Presente (R$ 10.00)`;
        }
        if (this.incluirFrete) {
            descricao += ` + Frete Expresso (R$ 20.00)`;
        }
        return descricao;
    }
}
// cria um pedido com todos os adicionais incluídos
const pedido = new Pedido(100, true, true, true);
// imprime a descrição e o total final do pedido
console.log(pedido.descrever());
console.log(`Total: R$ ${pedido.calcularTotal().toFixed(2)}`);
// implementação simples de um pedido com valor base
class PedidoSimples {
    valorBase;
    constructor(valorBase) {
        this.valorBase = valorBase;
    } // armazena o valor base do pedido
    calcularTotal() {
        return this.valorBase; // retorna o valor base
    }
    descrever() {
        return `Pedido base de R$ ${this.valorBase.toFixed(2)}`; // descrição inicial
    }
}
// classe abstrata que serve de base para os decoradores de pedido
class PedidoDecorator {
    componente;
    constructor(componente) {
        this.componente = componente;
    } // recebe o componente a ser decorado
}
// decorador que adiciona o custo de frete expresso ao pedido
class FreteExpresso extends PedidoDecorator {
    calcularTotal() {
        return this.componente.calcularTotal() + 20; // adiciona R$ 20 ao total
    }
    descrever() {
        return `${this.componente.descrever()} + Frete Expresso (R$ 20.00)`; // adiciona descrição do frete
    }
}
// decorador que adiciona o custo de embalagem para presente
class EmbalagemPresente extends PedidoDecorator {
    calcularTotal() {
        return this.componente.calcularTotal() + 10; // adiciona R$ 10 ao total
    }
    descrever() {
        return `${this.componente.descrever()} + Embalagem para Presente (R$ 10.00)`; // adiciona descrição da embalagem
    }
}
// decorador que adiciona seguro ao pedido
class SeguroPedido extends PedidoDecorator {
    calcularTotal() {
        return this.componente.calcularTotal() + 15; // adiciona R$ 15 ao total
    }
    descrever() {
        return `${this.componente.descrever()} + Seguro (R$ 15.00)`; // adiciona descrição do seguro
    }
}
// cria um pedido simples de valor R$ 100,00
const pedidoDois = new PedidoSimples(100);
// aplica os decoradores seguro, embalagem e frete
const pedidoFinal = new FreteExpresso(new EmbalagemPresente(new SeguroPedido(pedidoDois)));
// imprime a descrição e o total final do pedido
console.log(pedidoFinal.descrever());
console.log(`Total: R$ ${pedidoFinal.calcularTotal().toFixed(2)}`);
