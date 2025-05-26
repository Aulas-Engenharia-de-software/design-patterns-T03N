from abc import ABC, abstractmethod

class Imagem(ABC):
    @abstractmethod
    def processar(self) -> str:
        pass

class ImagemOriginal(Imagem):
    def __init__(self, nome_arquivo: str):
        self.nome_arquivo = nome_arquivo

    def processar(self) -> str:
        return self.nome_arquivo

class FiltroImagem(Imagem):
    def __init__(self, imagem: Imagem):
        self._imagem = imagem

class FiltroCinza(FiltroImagem):
    def processar(self) -> str:
        return f"{self._imagem.processar()} -> filtro: cinza"

class FiltroRedimensionar(FiltroImagem):
    def processar(self) -> str:
        return f"{self._imagem.processar()} -> filtro: redimensionar"

class FiltroMarcaDagua(FiltroImagem):
    def processar(self) -> str:
        return f"{self._imagem.processar()} -> filtro: marca d'água"

imagem = ImagemOriginal("foto.jpg")
imagem = FiltroCinza(imagem)
imagem = FiltroRedimensionar(imagem)
imagem = FiltroMarcaDagua(imagem)

print(imagem.processar())
