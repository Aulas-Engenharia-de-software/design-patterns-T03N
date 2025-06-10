package org.example.shared

import java.math.BigDecimal

data class ProdutoDto(
    val nome: String,
    val preco: Double,
    val marca: String,
    val categoria: CategoryEnum,
    val avaliacao: Double
)
