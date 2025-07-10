class Observador:
    def atualizar(self, mensagem):
        print(f"{self.__class__.__name__} recebeu: {mensagem}")


class Sujeito:
    def __init__(self):
        self._observadores = []

    def adicionar_observador(self, observador):
        self._observadores.append(observador)

    def remover_observador(self, observador):
        self._observadores.remove(observador)

    def remover_todos_observadores(self):  #para remover eles após a not de falha
        self._observadores.clear()
        print("Todos os observadores foram removidos.")

    def notificar(self, mensagem):
        for observador in self._observadores:
            observador.atualizar(mensagem)


class Usuario(Observador):
    def __init__(self, nome):
        self.nome = nome

    def atualizar(self, mensagem):
        print(f"Usuário {self.nome} recebeu a notificação: {mensagem}")


class Admin(Observador):
    def __init__(self, nome):
        self.nome = nome

    def atualizar(self, mensagem):
        print(f"Admin {self.nome} recebeu a notificação: {mensagem}")


class Funcionario(Observador):
    def __init__(self, nome):
        self.nome = nome

    def atualizar(self, mensagem):
        print(f"Funcionário {self.nome} recebeu a notificação: {mensagem}")


if __name__ == "__main__":
    sujeito = Sujeito()

    user1 = Usuario("Ana")
    user2 = Usuario("João")
    admin = Admin("Luis")
    funcionario = Funcionario("Pedro")  

    sujeito.adicionar_observador(user1)
    sujeito.adicionar_observador(user2)
    sujeito.adicionar_observador(admin)

    sujeito.notificar("Vídeo novo!")

    sujeito.remover_observador(user2)
    sujeito.remover_observador(user1)

    sujeito.notificar("Falha no novo conteúdo!")


    sujeito.remover_todos_observadores()

  
    sujeito.adicionar_observador(funcionario)

    
    sujeito.notificar("Pro RH AMANHÃ.")
