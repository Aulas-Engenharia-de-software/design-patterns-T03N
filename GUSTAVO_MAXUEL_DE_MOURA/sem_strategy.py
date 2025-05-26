class Pedido:
    def __init__(self, valor: float, tipo_cliente: str):
        self.valor = valor
        self.tipo_cliente = tipo_cliente

    def valor_com_desconto(self) -> float:
        if self.tipo_cliente == "regular":
            return self.valor * 0.95
        elif self.tipo_cliente == "vip":
            return self.valor * 0.90
        elif self.tipo_cliente == "premium":
            return self.valor * 0.80
        else:
            return self.valor

pedido1 = Pedido(100, "regular")
pedido2 = Pedido(100, "vip")
pedido3 = Pedido(100, "premium")

print(pedido1.valor_com_desconto())  
print(pedido2.valor_com_desconto())  
print(pedido3.valor_com_desconto())  
