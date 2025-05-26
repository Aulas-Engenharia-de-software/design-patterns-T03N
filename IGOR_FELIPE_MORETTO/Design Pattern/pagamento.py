class Pagamento:
    def pagar(self, valor):
        pass

class PagamentoCartao:
    def pagar(self, valor):
        print(f"Pagamento de R${valor:.2f} realizado no cartão de crédito.")

class PagamentoBoleto:
    def pagar(self, valor):
        print(f"Pagamento de R${valor:.2f} realizado via boleto.")

# Uso
tipo_pagamento = input("Digite 'cartao' ou 'boleto': ")
valor = float(input("Informe o valor: "))

if tipo_pagamento == "cartao":
    pagamento = PagamentoCartao()
    pagamento.pagar(valor)
elif tipo_pagamento == "boleto":
    pagamento = PagamentoBoleto()
    pagamento.pagar(valor)
else:
    print("Tipo de pagamento inválido.")
