package org.example.shared

import java.math.BigDecimal

val DummyList = listOf<ProdutoDto>(
    ProdutoDto(
        nome = "Pão de Queijo",
        preco = 3.22,
        marca = "Sem marca",
        categoria = CategoryEnum.ALIMENTOS,
        avaliacao = 4.5
    ),
    ProdutoDto(
        nome = "Telefone Apple",
        preco = 2792.00,
        marca = "Apple",
        categoria = CategoryEnum.ELETRONICOS,
        avaliacao = 4.0
    ),
    ProdutoDto(
        nome = "Mouse",
        preco = 60.0,
        marca = "Logitech",
        categoria = CategoryEnum.ELETRONICOS,
        avaliacao = 3.6
    ),
    ProdutoDto(
        nome = "Camisa amarela",
        preco = 40.0,
        marca = "Sem marca",
        categoria = CategoryEnum.ROUPAS,
        avaliacao = 2.5
    ),
)