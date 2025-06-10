class SorveteSimples:
    def __init__(self, calda=False, granulado=False):  # corrigido __init__
        self.calda = calda
        self.granulado = granulado

    def descricao(self):
        desc = "Sorvete"
        if self.granulado:
            desc += " com granulado"
        if self.calda:
            desc += " com calda de chocolate"
        return desc

    def preco(self):
        preco = 5.0
        if self.granulado:
            preco += 1.0
        if self.calda:
            preco += 1.5
        return preco

# --- EXEMPLO DE USO ---
sorvete2 = SorveteSimples(calda=True, granulado=True)
print(sorvete2.descricao())
print(f"Preço: R$ {sorvete2.preco():.2f}")
