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

    def notificar(self, mensagem):
        for observador in self._observadores:
            observador.atualizar(mensagem)

class Usuario(Observador):
    def __init__(self, nome):
        self.nome = nome

    def atualizar(self, mensagem):
        print(f"{self.nome} recebeu a notificação: {mensagem}")


if __name__ == "__main__":
    sujeito = Sujeito()

    user1 = Usuario("Ana")
    user2 = Usuario("João")

    sujeito.adicionar_observador(user1)
    sujeito.adicionar_observador(user2)

    sujeito.notificar("Novo conteúdo disponível!")

    sujeito.remover_observador(user1)

    sujeito.notificar("Atualização importante!")
