package org.example.withPattern

import org.example.shared.CategoryEnum
import org.example.shared.ProdutoDto

class FiltroPorNome(
    private val nomeProcurado: String
) : IFiltroProduto {
    override fun filtrar(lista: List<ProdutoDto>): List<ProdutoDto> {
        return lista.filter {
            it.nome.lowercase().contains(nomeProcurado.trim().lowercase())
        }
    }
    override fun declare(): String = "Nome (%$nomeProcurado%)"
}
class FiltroPorPreco(
    private val precoMinimo: Double = 0.0,
    private val precoMaximo: Double = 3000.0
) : IFiltroProduto {
    override fun filtrar(lista: List<ProdutoDto>): List<ProdutoDto> {
        return lista.filter { it.preco >= precoMinimo && it.preco <= precoMaximo }
    }
    override fun declare(): String = "Preço (>=$precoMinimo, <=$precoMaximo)"
}
class FiltroPorMarca(
    private val marcaDesejada: String,
) : IFiltroProduto {
    override fun filtrar(lista: List<ProdutoDto>): List<ProdutoDto> {
        return lista.filter { it.marca == marcaDesejada }
    }
    override fun declare(): String = "Marca ($marcaDesejada)"
}
class FiltroPorCategoria(
    private val categoriaDesejada: CategoryEnum,
) : IFiltroProduto {
    override fun filtrar(lista: List<ProdutoDto>): List<ProdutoDto> {
        return lista.filter { it.categoria == categoriaDesejada }
    }
    override fun declare(): String = "Categoria ($categoriaDesejada)"
}
class FiltroPorAvaliacao(
    private val avaliacaoMinima: Double = 3.0,
) : IFiltroProduto {
    override fun filtrar(lista: List<ProdutoDto>): List<ProdutoDto> {
        return lista.filter { it.avaliacao >= avaliacaoMinima }
    }
    override fun declare(): String = "Avaliação (>=$avaliacaoMinima)"
}