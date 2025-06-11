from abc import ABC, abstractmethod

# Interface
class PagamentoStrategy(ABC):
    @abstractmethod
    def pagar(self, valor):
        pass

# Estratégias
class CartaoCredito(PagamentoStrategy):
    def pagar(self, valor):
        print(f"Pagamento de R${valor:.2f} realizado no cartão de crédito.")

class Boleto(PagamentoStrategy):
    def pagar(self, valor):
        print(f"Pagamento de R${valor:.2f} realizado via boleto.")

class Pagamento:
    def __init__(self, estrategia: PagamentoStrategy):
        self.estrategia = estrategia

    def realizar_pagamento(self, valor):
        self.estrategia.pagar(valor)

tipo_pagamento = input("Digite 'cartao' ou 'boleto': ")
valor = float(input("Informe o valor: "))

if tipo_pagamento == "cartao":
    estrategia = CartaoCredito()
elif tipo_pagamento == "boleto":
    estrategia = Boleto()
else:
    print("Tipo de pagamento inválido.")
    exit()

pagamento = Pagamento(estrategia)
pagamento.realizar_pagamento(valor)