def processar_imagem(nome_arquivo: str, aplicar_cinza=False, redimensionar=False, marca_dagua=False) -> str:
    resultado = nome_arquivo
    if aplicar_cinza:
        resultado += " -> filtro: cinza"
    if redimensionar:
        resultado += " -> filtro: redimensionar"
    if marca_dagua:
        resultado += " -> filtro: marca d'água"
    return resultado

resultado = processar_imagem("foto.jpg", aplicar_cinza=True, redimensionar=True, marca_dagua=True)
print(resultado)
