class Mensagem:
    def __init__(self, conteudo):
        self.conteudo = conteudo

    def enviar(self):
        print(f"Enviando mensagem: {self.conteudo}")

class MensagemCriptografada(Mensagem):
    def enviar(self):
        conteudo = self._criptografar(self.conteudo)
        print(f"Enviando mensagem criptografada: {conteudo}")

    def _criptografar(self, texto):
        return ''.join(chr(ord(c) + 1) for c in texto) 

class MensagemComprimida(Mensagem):
    def enviar(self):
        conteudo = self._comprimir(self.conteudo)
        print(f"Enviando mensagem comprimida: {conteudo}")

    def _comprimir(self, texto):
        return texto.replace(" ", "") 


msg1 = Mensagem("Olá mundo")
msg1.enviar()

msg2 = MensagemCriptografada("Olá mundo")
msg2.enviar()

msg3 = MensagemComprimida("Olá mundo")
msg3.enviar()
