from abc import ABC, abstractmethod

# Interface Strategy
class PagamentoStrategy(ABC):
    @abstractmethod
    def pagar(self, valor):
        pass

# Estratégia Cartão
class CartaoCredito(PagamentoStrategy):
    def pagar(self, valor):
        print(f"Pagamento de R${valor:.2f} realizado no cartão de crédito.")

# Estratégia Boleto
class Boleto(PagamentoStrategy):
    def pagar(self, valor):
        print(f"Pagamento de R${valor:.2f} realizado via boleto.")

# Contexto
class Pagamento:
    def __init__(self, estrategia: PagamentoStrategy):
        self.estrategia = estrategia

    def realizar_pagamento(self, valor):
        self.estrategia.pagar(valor)

# Uso
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
