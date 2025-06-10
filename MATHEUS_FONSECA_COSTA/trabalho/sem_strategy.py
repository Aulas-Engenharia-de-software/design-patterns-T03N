class Pedido:
    def _init_(self, valor):
        self.valor = valor

    def pagar(self, estrategia_pagamento):
        estrategia_pagamento.pagar(self.valor)

class PagamentoCredito:
    def pagar(self, valor):
        print(f"[Strategy] Pagando R$ {valor:.2f} com cartão de crédito.")

class PagamentoPix:
    def pagar(self, valor):
        print(f"[Strategy] Pagando R$ {valor:.2f} com Pix.")

class PagamentoDinheiro:
    def pagar(self, valor):
        print(f"[Strategy] Pagando R$ {valor:.2f} em dinheiro.")
        print("\n--- SEM STRATEGY ---")
    pedido2 = PedidoSemStrategy(12.5)
    pedido2.pagar("pix")