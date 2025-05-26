class DescontoStrategy:
    def aplicar(self, valor):
        raise NotImplementedError()

class DescontoFixo(DescontoStrategy):
    def aplicar(self, valor):
        return valor - 10

class DescontoPercentual(DescontoStrategy):
    def aplicar(self, valor):
        return valor * 0.9 


class SemDesconto(DescontoStrategy):
    def aplicar(self, valor):
        return valor

class CalculadoraPreco:
    def __init__(self, strategy: DescontoStrategy):
        self.strategy = strategy

    def set_strategy(self, strategy: DescontoStrategy):
        self.strategy = strategy

    def calcular(self, valor):
        return self.strategy.aplicar(valor)

print("=== CALCULADORA DE DESCONTO ===")
valor = float(input("Digite o valor do produto: R$ "))

print("\nEscolha o tipo de desconto:")
print("1 - Desconto fixo de R$10")
print("2 - Desconto percentual de 10%")
print("3 - Sem desconto")
opcao = input("Opção (1/2/3): ")

if opcao == "1":
    estrategia = DescontoFixo()
elif opcao == "2":
    estrategia = DescontoPercentual()
else:
    estrategia = SemDesconto()

calculadora = CalculadoraPreco(estrategia)
resultado = calculadora.calcular(valor)

print(f"\nPreço final com desconto: R$ {resultado:.2f}")
