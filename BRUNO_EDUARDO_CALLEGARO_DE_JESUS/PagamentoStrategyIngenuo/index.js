class Pagamento {
  pagarCartao(valor) {
    console.log(`Pagando R$ ${valor} no Cartão.`);
  }

  pagarDinheiro(valor) {
    console.log(`Pagando R$ ${valor} em Dinheiro.`);
  }

  pagarPix(valor) {
    console.log(`Pagando R$ ${valor} via PIX.`);
  }
}


const pagamento = new Pagamento();

const metodo = "cartao"; 
const valor = 100;

if (metodo === "cartao") {
  pagamento.pagarCartao(valor);
} else if (metodo === "dinheiro") {
  pagamento.pagarDinheiro(valor);
} else if (metodo === "pix") {
  pagamento.pagarPix(valor);
} else {
  console.log("Método de pagamento inválido.");
}
