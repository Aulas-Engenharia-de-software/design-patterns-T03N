from abc import ABC, abstractmethod

class DescontoStrategy(ABC):
    @abstractmethod
    def calcular(self, valor: float) -> float:
        pass

class DescontoRegular(DescontoStrategy):
    def calcular(self, valor: float) -> float:
        return valor * 0.95  

class DescontoVip(DescontoStrategy):
    def calcular(self, valor: float) -> float:
        return valor * 0.90  

class DescontoPremium(DescontoStrategy):
    def calcular(self, valor: float) -> float:
        return valor * 0.80  

class Pedido:
    def __init__(self, valor: float, strategy: DescontoStrategy):
        self.valor = valor
        self.strategy = strategy

    def valor_com_desconto(self) -> float:
        return self.strategy.calcular(self.valor)

pedido1 = Pedido(100, DescontoRegular())
pedido2 = Pedido(100, DescontoVip())
pedido3 = Pedido(100, DescontoPremium())

print(pedido1.valor_com_desconto())  
print(pedido2.valor_com_desconto())  
print(pedido3.valor_com_desconto())  
