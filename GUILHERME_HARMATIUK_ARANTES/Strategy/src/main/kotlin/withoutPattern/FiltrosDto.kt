package org.example.withoutPattern

import org.example.shared.CategoryEnum

data class FiltrosDto(
    val filtroNome: String?=null,
    val filtroAvaliacao: Double?=null,
    val filtroMarca: String?=null,
    val filtroCategoria: CategoryEnum?=null,
    val filtroPrecoMinimo: Double?=null,
    val filtroPrecoMaximo: Double?=null
)
