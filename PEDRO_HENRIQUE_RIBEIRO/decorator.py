def correto_decorator(func):
    def wrapper():
        print("Adicionando leite...")
        resultado = func()  
        return resultado    
    return wrapper  

@correto_decorator
def fazer_cafe():
    print("Fazendo café")
    return "Café pronto"

resultado = fazer_cafe()
print("Resultado:", resultado)
