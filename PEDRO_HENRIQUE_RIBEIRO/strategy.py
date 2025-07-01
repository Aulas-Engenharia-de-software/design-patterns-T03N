from abc import ABC, abstractmethod

class PrepararCafeStrategy(ABC):
    @abstractmethod
    def preparar(self):
        pass

class CafeSimplesStrategy(PrepararCafeStrategy):
    def preparar(self):
        return "Café simples"

class CafeComLeiteStrategy(PrepararCafeStrategy):
    def preparar(self):
        return "Café com leite"


class CafeExpressoStrategy(PrepararCafeStrategy):
    def preparar(self):
        return "Café expresso forte"


class MaquinaDeCafe:
    def __init__(self, estrategia: PrepararCafeStrategy):
        self.estrategia = estrategia

    def preparar_cafe(self):
        return self.estrategia.preparar()

    def mudar_estrategia(self, nova_estrategia: PrepararCafeStrategy):
        self.estrategia = nova_estrategia

if __name__ == "__main__":
    maquina = MaquinaDeCafe(CafeSimplesStrategy())
    print(maquina.preparar_cafe())  

    maquina.mudar_estrategia(CafeComLeiteStrategy())
    print(maquina.preparar_cafe()) 

    maquina.mudar_estrategia(CafeExpressoStrategy())
    print(maquina.preparar_cafe())  
