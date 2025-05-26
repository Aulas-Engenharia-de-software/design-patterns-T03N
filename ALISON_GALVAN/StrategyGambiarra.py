def calcular_preco(valor, tipo_desconto):
    if tipo_desconto == "1":
        return valor - 10
    elif tipo_desconto == "2":
        return valor * 0.9  
    else:
        return valor  

print("=== CALCULADORA DE DESCONTO ===")
valor = float(input("Digite o valor do produto: R$ "))

print("\nEscolha o tipo de desconto:")
print("1 - Desconto fixo de R$10")
print("2 - Desconto percentual de 10%")
print("3 - Sem desconto")
opcao = input("Opção (1/2/3): ")

resultado = calcular_preco(valor, opcao)
print(f"\nPreço final com desconto: R$ {resultado:.2f}")
