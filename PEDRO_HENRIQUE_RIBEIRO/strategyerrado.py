
class CafeSimples:
    def preparar(self):
        return "Café simples"

class MaquinaDeCafe:
    def __init__(self):
        self.cafe = CafeSimples()  

    def preparar_cafe(self):
        
        return self.cafe.preparar()

class CafeComLeite:
    def preparar(self):
        return "Café com leite"

if __name__ == "__main__":
    maquina = MaquinaDeCafe()
    print(maquina.preparar_cafe())  


    maquina.cafe = CafeComLeite()   
    print(maquina.preparar_cafe())  
