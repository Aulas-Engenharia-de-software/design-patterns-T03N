# Decorator com erro proposital
def errado_decorator(func):
    def wrapper():
        print("Adicionando leite...")
        func() 

@errado_decorator
def fazer_cafe():
    print("Fazendo café")
    return "Café pronto"

resultado = fazer_cafe()
print("Resultado:", resultado)  
