class Sorvete:
    def descricao(self):
        return "Sorvete"

    def preco(self):
        return 5.0                                                                                                         

class SorveteDecorator(Sorvete):
    def __init__(self, sorvete):  # CORRIGIDO: "__init__"
        self._sorvete = sorvete

    def descricao(self):
        return self._sorvete.descricao()

    def preco(self):
        return self._sorvete.preco()

class CaldaChocolate(SorveteDecorator):
    def descricao(self):
        return self._sorvete.descricao() + " com calda de chocolate"

    def preco(self):
        return self._sorvete.preco() + 1.5

class Granulado(SorveteDecorator):
    def descricao(self):
        return self._sorvete.descricao() + " com granulado"

    def preco(self):
        return self._sorvete.preco() + 1.0


sorvete = Sorvete()
sorvete_completo = CaldaChocolate(Granulado(sorvete))

print(sorvete_completo.descricao())  # Saída: Sorvete com granulado com calda de chocolate
print(f"Preço: R$ {sorvete_completo.preco():.2f}")  # Saída: Preço: R$ 7.50
