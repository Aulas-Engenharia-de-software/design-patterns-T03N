class CafeSimples:
    def custo(self):
        return 5.0

    def descricao(self):
        return "Café simples"

class CafeComLeite:
    def custo(self):
        return 7.0

    def descricao(self):
        return "Café com leite"

class CafeComChantilly:
    def custo(self):
        return 8.0

    def descricao(self):
        return "Café com chantilly"

opcao = input("Escolha: 'simples', 'leite' ou 'chantilly': ")

if opcao == "simples":
    cafe = CafeSimples()
elif opcao == "leite":
    cafe = CafeComLeite()
elif opcao == "chantilly":
    cafe = CafeComChantilly()
else:
    print("Opção inválida.")
    exit()

print(f"Pedido: {cafe.descricao()}")
print(f"Custo: R${cafe.custo():.2f}")
