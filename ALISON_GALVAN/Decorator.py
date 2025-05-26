class Mensagem:
    def __init__(self, conteudo):
        self._conteudo = conteudo

    def enviar(self):
        print(f"Enviando mensagem: {self._conteudo}")

    def get_conteudo(self):
        return self._conteudo

    def set_conteudo(self, conteudo):
        self._conteudo = conteudo

class MensagemDecorator:
    def __init__(self, mensagem):
        self._mensagem = mensagem

    def enviar(self):
        self._mensagem.enviar()

    def get_conteudo(self):
        return self._mensagem.get_conteudo()

    def set_conteudo(self, conteudo):
        self._mensagem.set_conteudo(conteudo)

class MensagemCriptografada(MensagemDecorator):
    def enviar(self):
        conteudo = self.get_conteudo()
        criptografado = self._criptografar(conteudo)
        self.set_conteudo(criptografado)
        print("Aplicando criptografia...")
        self._mensagem.enviar()

    def _criptografar(self, texto):
        return ''.join(chr(ord(c) + 1) for c in texto)

class MensagemComprimida(MensagemDecorator):
    def enviar(self):
        conteudo = self.get_conteudo()
        comprimido = self._comprimir(conteudo)
        self.set_conteudo(comprimido)
        print("Aplicando compressão...")
        self._mensagem.enviar()

    def _comprimir(self, texto):
        return texto.replace(" ", "")

msg1 = Mensagem("Olá mundo")
msg1.enviar()

print("\nCom criptografia:")
msg2 = MensagemCriptografada(Mensagem("Olá mundo"))
msg2.enviar()

print("\nCom compressão:")
msg3 = MensagemComprimida(Mensagem("Olá mundo"))
msg3.enviar()

print("\nCom compressão e criptografia:")
msg4 = MensagemCriptografada(MensagemComprimida(Mensagem("Olá mundo")))
msg4.enviar()
