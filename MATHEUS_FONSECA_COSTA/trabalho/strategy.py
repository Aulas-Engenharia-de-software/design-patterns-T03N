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
        print("\n--- COM STRATEGY ---")
    pedido1 = Pedido(12.5)
    pedido1.pagar(PagamentoPix())
    