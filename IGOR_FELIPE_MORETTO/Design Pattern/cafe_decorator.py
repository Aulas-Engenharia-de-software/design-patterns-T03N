from abc import ABC, abstractmethod

# Componente
class Cafe(ABC):
    @abstractmethod
    def custo(self):
        pass

    @abstractmethod
    def descricao(self):
        pass

# Componente Concreto
class CafeSimples(Cafe):
    def custo(self):
        return 5.0

    def descricao(self):
        return "Café simples"

# Decorator Abstrato
class CafeDecorator(Cafe):
    def __init__(self, cafe):
        self._cafe = cafe

    def custo(self):
        return self._cafe.custo()

    def descricao(self):
        return self._cafe.descricao()

# Decorators Concretos
class ComLeite(CafeDecorator):
    def custo(self):
        return super().custo() + 2.0

    def descricao(self):
        return super().descricao() + " + leite"

class ComChantilly(CafeDecorator):
    def custo(self):
        return super().custo() + 3.0

    def descricao(self):
        return super().descricao() + " + chantilly"

# Uso
cafe = CafeSimples()

opcao = input("Adicionar 'leite', 'chantilly' ou 'ambos'?: ")

if opcao == "leite":
    cafe = ComLeite(cafe)
elif opcao == "chantilly":
    cafe = ComChantilly(cafe)
elif opcao == "ambos":
    cafe = ComLeite(cafe)
    cafe = ComChantilly(cafe)

print(f"Pedido: {cafe.descricao()}")
print(f"Custo: R${cafe.custo():.2f}")
